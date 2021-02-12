package com.iu.j1.object;

public class Object_1 {
	public static void main(String[] args) {
		
		Object object = new Object();
		String str = object.toString();
		System.out.println(str);
		System.out.println(object);
		int hash = object.hashCode();
		System.out.println(hash);
		
		Tiger tiger= new Tiger();
		System.out.println(tiger.toString());
		System.out.println(tiger); 	//원래는 주소가 나와야하는데 오버라이딩하면 주소를 잃음?..왜..? 
		
		System.out.println(tiger.hashCode()); //주소를 hash한 코드. hash는 
	}

}
