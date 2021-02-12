package com.iu.j1;

public class Basic_12 {
	public static void main(String[] args) {
		int age = 27;
		System.out.println("당신의 나이는"+age+"살입니다.");
		System.out.print("print 2번째 유형");
		System.out.println();
		
		//printf 사용시 예제 
		
		//%d 정수형, %4d는 4자리로 표현, %04d는 빈자리 0으로 채움.
		System.out.printf("당신의 나이는 %d 살입니다", age);
		System.out.printf("\n당신의 나이는 %04d살입니다", age);
		System.out.println();
		
		//%f 실수형.
		double point = 4.23;
		System.out.printf("당신의 성적은 %f입니다.", point);
		//%.1f 소수점 첫째자리까지 출력
		System.out.printf("\n당신의 성적은 %.1f입니다.", point);
		
		//%s 문자형.
		String name = "iu";
		System.out.printf("\n당신의 이름은 %s입니다.", name);
		
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1==10 && n2==30);
		//&& : 앞에것이 false면 뒤에 연산 안함 
		//&& : 앞에것이 true면 뒤에 연산 실행
		//|| : 앞에 true면 뒤에 연산 안함 stop. 
		//|| : 앞에 false면 뒤에 연산 실행check.
	}
}
