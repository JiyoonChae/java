package com.iu.j3;

public class MethodTest {
	//method 선언: [접근 지정자][그외 지정자] 리턴타입(void) 메서드명([매개변수 선언]-안써도됨){ }
	public void test() {
		int age=20;
		//구문(statement)들은 메서드 내부에 작성
		System.out.println("Hello World!");
		System.out.println(age);
		//멤버메서드를 쓰려면 객체를 만들어서 불러와서 써야함.
	} //메서드가 끝나면 호출한 곳으로 되돌아감.
	
	//메서드 여러개 선언 가능, main에서 method를 한번호출후 method이름 calling으로 사용가능.
	public void test2() {
		
		System.out.println("sss");
	}//메서드가 끝나면 호출한 곳으로 되돌아감.
	
}
