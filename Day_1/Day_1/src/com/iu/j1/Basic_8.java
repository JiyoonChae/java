package com.iu.j1;

public class Basic_8 {
	public static void main(String [] args) {
		int age = 20;
		double num = 3.123;
		
		System.out.println(age);
		System.out.println(num);
		num=age; //int는 double로 자동변환 =double타입에도 쓸 수 있음.
		System.out.println(num);
		num=3.213; //double 타입
		System.out.println(num); 
		System.out.println(age); 
		//age = num;  int에 double값을 넣으려니까 에러뜸. 
		//Type mismatch: cannot convert from double to int.
		
		age = (int)num; //double을 강제로 int로 형변환 시켜줘야함.
		System.out.println(age); 
	}
}
