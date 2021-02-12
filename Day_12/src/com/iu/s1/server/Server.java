package com.iu.s1.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import com.iu.s1.message.MessageIO;
import com.iu.s1.message.StudentIO;
import com.iu.s1.view.MessageView;

public class Server {
	
	private Scanner sc;
	private String message;	//messageIO 변수
	private String info;	//studentIO 변수
	private boolean check;
	private ArrayList<String> list;
	
	public Server() {
		sc = new Scanner(System.in);
	}	
	
	public void start() throws IOException {
		//클라이언트와 연결
		ServerSocket serverSocket = new ServerSocket(8282);
		System.out.println("기다리는 중...");
		Socket socket = serverSocket.accept();
		System.out.println("Client와 연결 성공");
		
		check = true;
		
		//MessageIO messageIO = new MessageIO();
		//MessageView messageView = new MessageView();
		StudentIO io = new StudentIO();
		
		
		while(check) {
			//message = messageIO.receiveMessage(socket);
			//int select = Integer.parseInt(message);
			
			//공통 2) 메뉴 받으면
			info = io.receiveMessage(socket);
			int select = Integer.parseInt(info);
			
			switch(select) {
			case 1 :
				//3)test.txt 파싱 list에 담고 한줄의 문자열로 만들어 전송
				try {
					
					info = io.changeFileList();	
					io.sendMessage(socket, info);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				/*
				System.out.println("이름을 입력하세요.");
				message = sc.next();
				messageIO.sendMessage(socket, message);
				*/
				break;
			case 2 :
				//3) 클라이언트로 검색할 이름을 입력하라는 메세지 전송
				info = "검색할 이름을 입력하세요.";
				io.sendMessage(socket, info);
				
				/*
				message = "이름을 입력하세요.";
				messageIO.sendMessage(socket, message);
				message = messageIO.receiveMessage(socket);
				messageView.view(message);
				*/
				break;
			case 3 :
				//프로그램 종료
				System.out.println("Client와 연결 종료");
				check = !check;
				break;
			default :
				System.out.println("잘못 입력 받음");
				break;
			}
		}//while 끝
		
		socket.close();
	}//start() 메서드 끝
}
