package com.iu.j3.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest4 {
	public static void main(String[] args) {
		// 입력받은 문자열을 파일에 작성
		// FileWriter 
		//FILE 이있으면 그걸 찾아서 내용입력
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test1", "test.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);	 // true 기존데이터에 추가, false 기존데이터  삭제하고 입력.
			boolean check = true;
			while(check) {
				System.out.println("메세지를 입력하세요");
				String message = sc.next();
				if(message.equals("q")) {
					break;
				}
				fw.write(message+"\r\n");
			}
			
		//	String message = "Hello world"; //이메시지를 빈test문서안에 작성하려고함. 프로그램내의 내용을 하드디스크로output하는것.
			//문자열을 한글자씩 잘라서 byte코드로 바꿔서 내보내야함. but 매번 이렇게 할 수없으니 대신해주는 class를 사용. = FileWriter
			 // fw.write(message+"\r\n");  \n은 enter치는 기능, but 윗줄에 있던 자리에서 내려오기만함... \r이 맨앞으로 커서를 보내는 기능
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {		//finally는 예외발생여부 상관없이 무조건 실행됨, 연결을 해제시켜주는 역학
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}
}
