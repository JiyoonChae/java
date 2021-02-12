package com.iu.j1.message;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MessageIO {
private Scanner sc;
	
	private OutputStream os;
	private OutputStreamWriter ow;
	private BufferedWriter bw;
	
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	
	public MessageIO() {
		sc = new Scanner(System.in);
	}
	
	
	public String sendMessage(Socket socket, String str) throws Exception {
		//상대방에게 메세지를 전달 
		//전달할 메세지를 리턴
		System.out.println(" 전달할 메세지 입력");
		String message = sc.next();
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		bw.write(message+"\r\n");
		bw.flush();
		
		return message;
	}
	
	
	public String receivMessage(Socket socket, String student) throws Exception {
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		String message = br.readLine();
		
		System.out.println(message);
		
		return message;
	}
	


}
