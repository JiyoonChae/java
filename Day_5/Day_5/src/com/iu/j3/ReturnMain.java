package com.iu.j3;

public class ReturnMain {

	public static void main(String[] args) {
		ReturnTest1 r1 = new ReturnTest1(); //메서드를 사용하기 위해 먼저 객체생성
		r1.t1(); // 객체의 메서드 호출 (return이 없는 경우임!)
		
		int age = r1.t2();
		System.out.println(age);
		
		ReturnModel returnModel = r1.t3(); //return한 값을 받은것.
		r1.t3(); //이렇게 쓰는건 가능, 에러안남, return값이 있지만 받지 않은 것.
		//이거는 int age=r1.t2();랑 똑같은 거야~ ReturnModel이라는 타입을 class로만들었으니까! 
		//그리고 return을 했으니까 return한 값을 받기위해 타입 변수명 = return값. 이렇게 쓴것.
		
		System.out.println("Age: " +returnModel.age );
		System.out.println("name: " + returnModel.name);
		
		ReturnModel [] ar = r1.t4(); //array호출 : 타입만 바꿔주면됨!
			for(int i=0; i<ar.length; i++) {
				System.out.println("Age: " +ar[i].age );
				System.out.println("name: " + ar[i].name);
			}
			
		
	}

}
