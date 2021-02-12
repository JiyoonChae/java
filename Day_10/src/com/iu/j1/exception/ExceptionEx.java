package com.iu.j1.exception;

public class ExceptionEx {
	public void ex(int num) throws ArithmeticException, RuntimeException, Exception { //두개 이상 사용 가능
		int n = 10;
		int result = n/num;
		//throw new AristhmeticException()  여기서 이게 발생하면 throws로 던져주는거
		System.out.println(result);
	}
	
		//사용자정의 예외클래스
		public void ex2(int num1, int num2) throws Exception {
			int r1 = num1 + num2;
			int r2 = num1 - num2;
			if(r2<0) {  //r2<0이면 exception을 발생시키고싶음
				throw new MyException(); //MyException객체를 만들어서 던져버려라~~> 예외1 or 예외2까지 정의해줘야함
			}
			System.out.println(r1);
			System.out.println(r2);
		}
	
}
