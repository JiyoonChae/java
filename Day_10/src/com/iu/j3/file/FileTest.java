package com.iu.j3.file;

import java.io.File;


public class FileTest {
	public static void main(String[] args) {
		File file = new File("c:\\test1\\test.txt"); //1. ()에는 경로를 써줘야함
		file = new File("c:\\test", "test.txt"); // 2.(String pa, String ch) 부모폴더까지 쓰고, child는 확인할 파일이름 분리해서씀. 위에랑 같은 기능.
		File filePath = new File("c:\\test"); 	// 3.정보를 확인하고싶은 파일이 있는 부모폴더까지만 접근할 수 있는 객체생성!
		file = new File(filePath, "test.txt"); // (File parent, String child) 그리고 구체적인 파일명으로 접근!
		
		//file.mkdir();	//해당하는 폴더를 만드는 식
		System.out.println(file.exists());	//있는지 확인
		System.out.println(file.isDirectory()); //폴더인지 물어보는것
		System.out.println(file.isFile()); //파일이 일반파일인지 표시
		System.out.println(file.length()); //크기를
		System.out.println(file.getPath()); // 파일의 경로
		
	//	boolean check = file.delete();		//폴더를 삭제하고 성공하면 true, 실패하면 false. 만약 폴더안에 다른파일들이있으면 못지움. 빈폴더만 삭제가능
	//	System.out.println(check);
		
		
	}
}
