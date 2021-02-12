package com.iu.j2.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest2 {
	public static void main(String[] args) {
		InputStream is = System.in; //byte 키보드로부터 데이터를 입력받음
		InputStreamReader ir = new InputStreamReader(is); //is 데이터를 연결함, char
		BufferedReader br =new BufferedReader(ir); //String 
		//byte처리 ->문자char로 처리 ->문자열String로 처리 순
		
		try {
			System.out.println("입력");
			//int n = ir.read();			//입력하는만큼(글자수만큼) read를 반복해야함. 더이상읽을게 없으면 -1리턴.
			String str = br.readLine();  	//입력한 그대로 출력
			//System.out.println((char)n);
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {							//외부와의 연결 역순으로 연결을 해제해주는것 is-ir-br순을 역순으로
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
