package com.iu.j2.serverTest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.iu.j1.message.MessageIO;

public class Client {
	
	public void start() throws Exception {
		Socket socket = new Socket("127.0.0.1", 8281);
		System.out.println("서버에 연결 성공");
		InputStream in = socket.getInputStream();
		Scanner sc = new Scanner(System.in);
		MessageIO messageIO = new MessageIO();
		int select = 0;
		while(true) {
			System.out.println("1. 정보 출력");
			System.out.println("2. 정보 입력");
			System.out.println("3. 종료");
			select = sc.nextInt();
			String message =null;
			String str = null;
			switch(select) {
			case 1:
				//int 1을 string "1"로 바꿔서 서버로 보내기 
				//돌아온 String타입의 한줄을 파싱해서 리스트에 저장.
				str = String.valueOf(select);
				message = messageIO.sendMessage(socket, str);
			
				break;
			case 2:
				str = String.valueOf(select);
				break;
			case 3:
				str = String.valueOf(select);
				break;
			}
			 
			
			if(message.equals("q")) {
				break;
			}
			
			System.out.println("서버로 메세지 전달 끝");
			
			message = messageIO.receivMessage(socket, str);

			if(message.equals("q")) {
				break;
			}
			
		}

		socket.close();
		/*
		
		while(true) {
			System.out.println("1. 정보 출력");
			System.out.println("2. 정보 입력");
			System.out.println("3. 종료");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				String str = messageIO.sendMessage(socket);
				
			
				break;
			case 2:
				break;
			case 3:
				break;
			}
			
		}*/
		
		
	}
	
	
}
