package com.iu.j1;

import java.util.Scanner;

public class Basic_11 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = "123";
		int num2 = 0;
		
		char ch = 'h';
		num2 = ch; //char -> int 자동변환됨.
		
		System.out.println(num2);
		
		System.out.println("숫자를 입력하세요");
		num2 = sc.nextInt();
		
		ch = (char)num2; //int->char로 강제 변환 해야함.
		System.out.println(ch);
	}
}
