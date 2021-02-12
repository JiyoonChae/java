package com.iu.j1.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public void start() throws Exception {
		
			ServerSocket ss = new ServerSocket(8282);	//port는 유일해야함. 중복될경우를 'port 충돌' 이라함
	       System.out.println("클라이언트를 기다리는 중");
	       
	       Socket sc = ss.accept();  //클라이언트가 소켓으로 연결시도 시 그안에 상대의 ip,port 가 있음, 그걸 바탕으로 서버의 소켓을 생성하는 것
	       System.out.println("클라이언트와 연결 성공");
	       
	       InputStream is = null;
	       InputStreamReader ir = null;
	       BufferedReader br = null;
	       OutputStream os = null;
	       OutputStreamWriter ow = null;
	       BufferedWriter bw = null;
	       
	       while(true) {
	       //socket으로 클라이언트로부터 데이터가 들어올 것.
	       is = sc.getInputStream();  //InputStream 은 바이트를 다룸
	       ir = new InputStreamReader(is);  //바이트를 문자로
	       br = new BufferedReader(ir); // 문자를 문자열로
	       
	       String str = br.readLine(); 
	       System.out.println(str);
	       if(str.equals("q")) {
	    	   break;
	       }
	       //클라이언트로 메시지 보내기
	       Scanner scn = new Scanner(System.in);
	       System.out.println("클라이언트로 메시지 입력");
	       String message = scn.next();
	       
	       os = sc.getOutputStream();
	       ow = new OutputStreamWriter(os);
	       bw = new BufferedWriter(ow);
	       bw.write(message+"\r\n");
	       bw.flush();
	       if(message.equals("q")) {
	    	   break;
	     }
	     
	       
	       }//while끝
	       
	       
	       
	       br.close();
	       ir.close();
	       is.close();
	       	       
	       bw.close();
	       ow.close();
	       os.close();	       
	       sc.close();
	
	}
}
