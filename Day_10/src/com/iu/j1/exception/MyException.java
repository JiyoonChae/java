package com.iu.j1.exception;

public class MyException extends Exception{
	//사용자정의 예외클래스  : Exception을 상속받음
	@Override
	public String getMessage() {
		
		return "음수가 발생";
	}
	
}
