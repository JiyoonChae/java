package com.iu.j5.list;

import java.util.ArrayList;

public class ListMain2 {
	public static void main(String[] args) {
		//데이터를 추가 제한
		//Generic E(변수명)
		ArrayList<Integer> ar = new ArrayList<>(); 
		//reference 타입만 사용가능, 뒤에 <> 같은 타입이니까 생략가능. generic으로 integer만 선언, integer만 담을 수 있음
		ar.add(20);
		//ar.add("20");  string타입이라 추가 불가!
		ar.add((int)'a'); //char는 int로 강제변환(primitive니까) 해서 추가 가능.
		
		Integer num = ar.get(0); 	//<>이면 Object 타입으로 선언해야하는데 <Integer>라서 바로 사용가능
		
		Phone phone = new Phone();
		phone.setBrand("LG");
		phone.setName("v20");
		phone.setPrice(100);
		
		Phone phone2 = new Phone();
		phone2.setBrand("samsung");
		phone2.setName("note20");
		phone2.setPrice(130);
		
		ArrayList<Phone> ar2 = new ArrayList<>();
		ar2.add(phone);
		ar2.add(phone2);
		//두번째 핸드폰을 꺼내서 변수에 저장하고  가격 출력
		Phone ph = ar2.get(1);
		System.out.println(ph.getPrice());
		
		for(int i=0; i<2; i++) {
			Phone p = new Phone();
			p.setBrand("Apple");
			p.setName("iphone12");
			p.setPrice(120);
			
			ar2.add(p); //폰하나 만들어서 리스트에 추가하겠다
		}
		
		for(int i=0; i<ar2.size(); i++) {
			ph = ar2.get(i);
			System.out.println(ph.getBrand());
			System.out.println(ph.getName());
			System.out.println(ph.getPrice());
		
		}
	}
	
	
}
