package com.iu.j6;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		//클래스명 변수명 = new 클래스명();
		//클래스명 변수명 = new 클래스의 생성자();
		Phone phone = new Phone(); // 객체생성 시 생성자 한번 호출.재호출 불가~!
		phone.info(); //객체의 참조변수 호출
		phone.test();  // new Phone() 은 생성자 메서드를 부르는게아니고 클래스 전체를 calling.
		
	//	Phone phone2 = new Phone("Apple");
	//	phone2.info();
		
	//	Phone phone3 = new Phone("LG", 80);
	//	phone3.info();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
	}
}
