package com.iu.j3;

public class J3Main {
	public static void main(String[] args) {
		//프로그램은 메인메서드부터 시작
		
		MethodTest t1 = new MethodTest();
		t1.test(); //method 호출(call)
		//메서드 여러개 선언 가능, main에서 method를 한번호출후 method이름 calling으로 사용가능.
		t1.test2();
		
		//count method 3번 호출
		MethodTest2 c1 = new MethodTest2();
		for(int i=0; i<3; i++) {
				c1.count();
		}
		
		MethodTest3 i1 = new MethodTest3();
			i1.info();
		
		//메인메서드가 끝나면 프로그램 종료
	}
}
