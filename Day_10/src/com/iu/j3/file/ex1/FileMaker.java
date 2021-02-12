package com.iu.j3.file.ex1;

import java.io.File;
import java.util.Scanner;

public class FileMaker {
	//makeDirectory method
	//폴더명을 입력
	//c:\\test\\ 입력받은 폴더명으로 폴더 생성
	//같은 폴더명이 없으면 생성 아니면 이미 있는폴더입니다.
	Scanner sc = new Scanner(System.in);
	public void makeDirectory() {
		
		System.out.println("폴더명 입력");
		String name = sc.next();
		String path ="c:\\test1\\"+name;
		
		File file = new File(path); //이 주소로 객체 생성, 디렉토리가 있을수도 있고 없을 수도 있으니까 확인먼저해야함
		if(!file.exists()) {				//존재하는 폴더인지 확인  true or false
			file.mkdir();				//존재하지않으면 만드세요~ boolean return함.
			System.out.println("폴더 생성");
		}else {
			System.out.println("이미 있는 폴더");
		}
	}
	
}
