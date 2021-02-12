package com.iu.j5;

import java.util.Scanner;

public class HapMain {
	public static void main(String[] args) {
		HapTest1 h1 = new HapTest1(); // 객체생성
		h1.plus(15, 20); // 호출 및 값
		
		double d= h1.multi(3.2, 9);
		System.out.println(d);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("salary 입력");
		int get = sc.nextInt();
		double aftertax = h1.sal(get, 0.033);
		System.out.println(aftertax);
}
}
