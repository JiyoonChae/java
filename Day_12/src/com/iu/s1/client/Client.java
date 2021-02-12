package com.iu.s1.client;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import com.iu.s1.message.StudentIO;
import com.iu.s1.student.Student;
import com.iu.s1.view.StudentView;

public class Client {
	
	private Scanner sc;
	private String message;	//messageIO 변수
	private String info;	//studentIO 변수
	private boolean check;
	private ArrayList<Student> students;
	
	public Client() {
		sc = new Scanner(System.in);
		students = new ArrayList<>();
	}
	
	
	public void makeStudent() {
		String str = "iu,1,20,30,40,suji,2,90,60,50";
	}//makeStudent() 메서드 끝	
	
	public void start() throws Exception {
		//서버와 연결 시도
		//Socket socket = new Socket("211.238.142.232", 8282);
		Socket socket = new Socket("127.0.0.1", 8282);
		System.out.println("Server와 연결 성공");
		
		check = true;
		
		//MessageIO messageIO = new MessageIO();
		//MessageView messageView = new MessageView();
		
		StudentIO io = new StudentIO();
		StudentView view = new StudentView();
		
		while(check) {
			try {
				System.out.println("1. 정보출력");
				System.out.println("2. 정보입력");
				System.out.println("3. 종료");
				System.out.print("메뉴 선택 >> ");
				int select = sc.nextInt();
				
				switch(select) {
				case 1 :
					//1)서버로 메뉴 전송
					io.sendMessage(socket, select);
					
					//4)Data 파싱 리스트에 담아서 전체 리스트 출력
					info = io.receiveMessage(socket);
					students = io.receiveMessage(info);
					view.view(students);
					
					
					/*
					messageIO.sendMessage(socket, message);
					message = messageIO.receiveMessage(socket);
					messageView.view(message);
					*/
					
					break;
				case 2 :
					//1) 서버로 메뉴전송
					io.sendMessage(socket, select);
					//4) 서버로부터 메세지 받아서 출력
					info = io.receiveMessage(socket);
					view.view(info);
					/*
					messageIO.sendMessage(socket, message);
					message = messageIO.receiveMessage(socket);
					messageView.view("이름을 입력하세요.");
					message = sc.next();
					messageIO.sendMessage(socket, message);
					*/
					break;
				case 3 :
					/*
					messageIO.sendMessage(socket, message);
					*/
					System.out.println("Server와 연결 종료");
					check = !check;
					break;
				default :
					System.out.println("1~3중에 입력하세요.");
					break;
				}//switch 끝
			} catch(Exception e) {
				e.printStackTrace();
			}
		}//while 끝
		
		socket.close();
	}//start() 메서드 끝
	
	
}
