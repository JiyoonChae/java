package com.iu.j5.list;

import java.util.ArrayList;

public class ListMain {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		//클래스명 변수명 = new 생성자();
		ArrayList ar = new ArrayList();
		
		//멤버 사용
		//참조 변수명.멤버
		//새로운 데이터 추가 add(Object type)!
		Integer i = new Integer(1); //primitive->reference
		i = 1; // auto boxing : primitive ->reference로 바로바꿈
		ar.add(1);		//원래는 new Integer(1)을 넣어야하는데 auto boxing으로 자동변환되어 Integer타입으로 들어감.
		ar.add("two");	//메모리안에 새로운 칸이 생기면서 값을 저장.
		ar.add('3');	
		ar.add(3.12);
		ar.add(8);
		ar.add(1, "test");	//index번호 자리에 새element를 끼워넣는것. 기존데이터 밀면서 중간삽입! 
		
		//Object obj  = ar.remove(0); //원하는 거 하나만 지움, 리턴은 지운 데이터 값. //데이터타입은 Object로 써야함.
		Integer obj = (Integer)ar.remove(0);
		System.out.println("remove : " + obj);
		
		ar.set(1, "four"); //원하는 index자리에 데이터 replace하는것. =수정
		
		for(int j=0; j<ar.size(); j++) {
		System.out.println(ar.get(j));
		}
		
	//	ar.clear();	//전체 리스트내용 삭제
	//	System.out.println("Clear : "+ ar.size());
		
		
		
		
	}
}
