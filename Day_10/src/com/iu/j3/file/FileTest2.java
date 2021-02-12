package com.iu.j3.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("c:\\test1");
		String [] ar = file.list();   //like dir,, 폴더명과 파일명 출력
		for(String s:ar) {
			//ex2 문자열을 폴더인지
			File f = new File(file, s); //객체생성 - file 부모폴더, s는 array안에든 각각의 요소
			if(f.isDirectory()) { 
				System.out.println("dir "+s);
			}
			if(f.isFile()) {
			System.out.println("file "+s);
		}
			}
	}
}
