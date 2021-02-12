package com.iu.j1;

import java.util.Scanner;

public class Basic_9 {
	public static void main(String [] args) {
		//키보드로부터 데이터 입력을 받을 준비.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		//키보드에 입력된 Data를 변수에 저장.
		int num = sc.nextInt();
		
		System.out.println("이름을 입력하세요");
		//키보드에 입력된 Data를 변수에 저장.
		String name = sc.next();
		
		System.out.println("최종 학점을 입력하세요");
		double point = sc.nextDouble();
		
		System.out.println("입력된 숫자: " + num);
		//System.out.println(num);
		
		System.out.println("이름: " + name);
		//System.out.println(name);
		
		System.out.println("학점: " + point);
		//System.out.println(point);
	}
}
