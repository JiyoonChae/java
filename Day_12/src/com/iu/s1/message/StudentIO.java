package com.iu.s1.message;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.s1.student.Student;

public class StudentIO {

	private Scanner sc;
	private OutputStream os;		//출력
	private OutputStreamWriter ow;
	private BufferedWriter bw;
	private InputStream is;			//입력
	private InputStreamReader ir;
	private BufferedReader br;
	private File file;				
	private FileReader fr;			//읽기(출력)
	private ArrayList<String> list;
	private ArrayList<Student> students;
	private String menu;
	
	public StudentIO() {
		sc = new Scanner(System.in);
		file = new File("c:\\test", "test.txt");
		list = new ArrayList<>();
		students = new ArrayList<>();
	}
	
	//Data 파싱하여 리스트에 담기
	public ArrayList<Student> receiveMessage(String info) throws IOException {
		StringTokenizer st = new StringTokenizer(info,",");
		
		while(st.hasMoreTokens()) {
			Student student = new Student();
			
			student.setName(st.nextToken().trim());
			student.setNum(Integer.parseInt(st.nextToken().trim()));
			student.setKor(Integer.parseInt(st.nextToken().trim()));
			student.setEng(Integer.parseInt(st.nextToken().trim()));
			student.setMath(Integer.parseInt(st.nextToken().trim()));
			
			student.setTotal(student.getKor() + student.getEng() + student.getMath());
			student.setAvg(student.getTotal() / 3.0);
			
			System.out.println("student - " + student.getName());
			students.add(student);
		}
		System.out.println("arr - " + students);
		return students;
	}
	
	//Client - 서버에서 문자열 받아오기
	public String receiveMessage(Socket socket) throws IOException {
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		String info = br.readLine();
		
		return info;
	}
	
	
	//Server - 한줄의 문자열로 만든 것을 Client에게 전송
	public void sendMessage(Socket socket, String info) throws IOException {
		//출력
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		bw.write(info + "\r\n");
		bw.flush();
	}
	
	//Client - 선택한 메뉴를 Server에게 전송
	public void sendMessage(Socket socket, int select) throws IOException {
		menu = menu.valueOf(select);
		this.sendMessage(socket, menu);
	}
	
	//Server - test.txt 파싱하여 List 담고 한줄의 문자열로 만들기
	public String changeFileList() throws Exception {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
				
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			list.add(str);
		}//while 끝
		
		String info = list.toString();
		info = info.substring(1, info.length()-1);
		
		return info;
	}//receiveFileList() 메서드 끝
	
	
}
