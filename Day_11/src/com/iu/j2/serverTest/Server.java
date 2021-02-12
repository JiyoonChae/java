package com.iu.j2.serverTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.iu.j1.message.MessageIO;

public class Server {
	public void start() throws Exception {
		ServerSocket ss = new ServerSocket(8281);
		System.out.println("클라이언트를 기다리는 중");
		
		 Socket sc = ss.accept(); 
	       System.out.println("클라이언트와 연결 성공");
	
	       MessageIO messageIO = new MessageIO();

			while(true) {
				String student =null;
				String str = messageIO.receivMessage(sc, student);

				if(str.equals("1")) {
					//test.txt 파싱해서 list에 담고  한줄 string 전송
					System.out.println("1 받음");
				}
				student = "jin, 1, 24, 55, 56";
				str = messageIO.sendMessage(sc, student);

				if(str.equals("q")) {
					break;
				}
			}
			
			sc.close();
	}
	
}
