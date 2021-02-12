package com.iu.j3.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest5 {
	public static void main(String[] args) {
		//파일의 내용을 읽어오기
		File file = new File("c:\\test1", "test.txt");//어느 파일을 읽을건지 경로명을 지정해야함.
		FileReader fr = null;
		BufferedReader br = null; //문자를 모아서 문자열로 바꿔주는 보조스트림이 필요함
		try {
			fr = new FileReader(file); //char타입 처리
			br = new BufferedReader(fr); // String 처리
			while(true) {
			String str = br.readLine();	//exception 타입이 다르면 내부적으로 계속 exception경고가뜸, 더큰 범위의 타입으로 바꾸면됨.
			if(str==null) {
				break;
			}
			System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
