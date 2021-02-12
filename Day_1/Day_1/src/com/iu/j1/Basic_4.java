package com.iu.j1;

public class Basic_4 {
	public static void main(String [] args) {
		//숫자형 : 정수형(4가지 종류)
		//DataType - Size
		//byte     - 1 byte  : 이진데이터를 다룰 때
		//short    - 2 byte : C언어와의 호환
		//int      - 4 byte  :자바에서 제일 많이씀
		//long     - 8 byte  :뒤에 l/L을 붙여줘야함
		//모두 숫자를 나타내는 데이터타입, 다룰 수 있는 크기의 차이.
		
		//변수 선언 
		byte num1 = 1;
		short num2 = 1;
		int num3 = 1;
		//long타입은 리터럴에 L(l)을 선언
		long num4 = 1L;
		//같은 데이터 타입만 호환이 됨. num3는 int고 num4는 long 이라서 호환안됨.
		//num3 = num4;
		
		/* int num3 = 2 를 같은 변수이름을 재선언하면 또 안됨. 중복 선언 불가.
		 * 재사용은 가능. 그냥 num3 = 2 로 새로운 값 할당.*/
	}
}
