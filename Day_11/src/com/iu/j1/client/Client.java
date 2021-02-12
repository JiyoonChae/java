package com.iu.j1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void start() throws Exception {
		//클라이언트가 서버에 접속
		//클라이언트가 서버로 메시지 전송
		//서버는 클라이언트로 받은 메세지를 출력하고 종료.
		//서버가 클라이언트로 메세지 전송, 클라이언트도 받은 메시지를 출력하고 종료.
		//서버에 접속을 위해서는 서버의 ip, port번호를 알아야함
		//127.0.0.1 어느 컴퓨터 간의 자기자신의 ip를 확인하는 주소. =localhost
		//서버로 접속 시도
		Socket socket = new Socket("211.238.142.231", 8282);
		System.out.println("서버에 접속 성공");
		
		Scanner sc = new Scanner(System.in);
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		while(check) {
		System.out.println("서버로 전달할 메세지 입력");
		String message = sc.next();
		os = socket.getOutputStream(); //출력스트림을 얻어서 소켓으로 가져옴
		//문자열 ->문자->바이트 로 변환해야함
		ow = new OutputStreamWriter(os); //문자를 취급
		bw = new BufferedWriter(ow); // 문자열을 취급
		bw.write(message+"\r\n");
		bw.flush();
		if(message.equals("q")) {
	    	   break;
	       }
		System.out.println("서버로 메세지 전달 끝");
		
		
		
		//server로부터 메시지 받아오기
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		String str = br.readLine();
		System.out.println(str);
		if(str.equals("q")) {
	    	   break;
	       }
		
		}//while 끝
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		socket.close();
		
		
		
	}	
	
}
