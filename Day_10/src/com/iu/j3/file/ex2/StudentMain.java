package com.iu.j3.file.ex2;

public class StudentMain {
	public static void main(String[] args) {
		//init 호출 ->view로 보내서 출력
	//	StudentController sc = new StudentController();
	//	sc.start();
		//바로 사용하는 방법도 있음 선언하지않고
		new StudentController().start();
	
	}
}
