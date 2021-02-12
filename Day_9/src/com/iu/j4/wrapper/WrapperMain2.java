package com.iu.j4.wrapper;

public class WrapperMain2 {
	public static void main(String[] args) {
		int num = 10;
		//auto boxing
		Integer n1 = num;
		
		//auto unboxing
		num = n1;
		
		double d1 = 3.12;
		Double d2 = d1;
		d1=d2;                     
		num = (int)d1; //primitive라 가능
		//num = (int)d2; //이건 d2는 클래스변수라서 안됨.
		
	}
}
