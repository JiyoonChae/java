package com.iu.j1.exception;
			
public class ExMain {
	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx();
		try {
			ex.ex2(10, 20);  //이거 호출했을 때 EXCEPTION이 발생할 수 있으니 받아서 처리를 해줘야함		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	}
}
