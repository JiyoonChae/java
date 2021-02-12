package com.iu.j2.io;

import java.io.IOException;
import java.io.InputStream;

public class InputTest1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		try {
			System.out.println("입력");
			int r = is.read();
			System.out.println((char)r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
