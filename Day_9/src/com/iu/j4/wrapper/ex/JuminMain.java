package com.iu.j4.wrapper.ex;

import java.util.Scanner;

public class JuminMain {

	public static void main(String[] args) {
		// 주민등록번호 입력: 991222-1234567받기
		// 주민 class 메서드 불러오기
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String jumin = sc.next();
		
		Jumin info = new Jumin();
	//	info.checkBirth(jumin);		
		info.checkJumin(jumin);
		
	}
	
	

}
