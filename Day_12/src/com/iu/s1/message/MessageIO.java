package com.iu.s1.message;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MessageIO {
	
	private String message;
	private OutputStream os;		//출력
	private OutputStreamWriter ow;
	private BufferedWriter bw;
	private InputStream is;			//입력
	private InputStreamReader ir;
	private BufferedReader br;

	
	public void sendMessage(Socket socket, String message) throws IOException {
		//출력
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		//System.out.print("전송할 메세지 입력 >> ");
		//message = sc.next();
		
		bw.write(message + "\r\n");
		bw.flush();
	}//sendMessage() 메서드 끝
	
	public String receiveMessage(Socket socket) throws IOException {
		//입력
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		message = br.readLine();
		
		return message;
	}//receiveMessage() 메서드 끝

}
