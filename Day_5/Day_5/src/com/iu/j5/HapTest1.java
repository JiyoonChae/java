package com.iu.j5;

public class HapTest1 {
	
	public void plus(int num1, int num2)	{
		int total = num1+num2;
		System.out.println(total);
	}
	
	public double multi(double d1, int num) {
		double result = d1 * num;
		return result;
	}
	
	//sal - 급여를 받아서 3.3 % 뗀 금액 (실수령액) 리턴 
	//main에서 급여를 입력받아서 실수령액을 출력
	 public double sal(double s, double s2) {
		 double salary = s - s * s2;
		 return salary;
	 }
	
	
}
