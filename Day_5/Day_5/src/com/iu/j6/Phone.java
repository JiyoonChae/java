package com.iu.j6;

public class Phone {
	//멤버 변수
	String name;
	int price;
	String color;
	
	//생성자
	//접근지정자 클래스명과 동일한 이름의 메서드명([매개변수 선언]) {}
	public Phone() {
		this("SAMSUNG");  //생성자 내에서 다른 생성자 호출 :자기자신에 (String)을 매개변수로 갖는 애를 찾는것.
	/**	System.out.println("phone 객체 생성");
		this.name="Samsung";
		this.price=100;
		this.color="purple";
		this.info();  //메서드 내에서 다른 메서드 호출 가능.*/

		
	}
	
	public Phone(String name) {
	//	this.name=name;
	//	this.price=100;
	//	this.color="purple";
		this(name, 100);
	}
	
	public Phone(String name, int price) {
		//this.name=name;
		//this.price=price;
		//this.color="purple";
		this(name, price, "black");
	}
	
	public Phone(String name, int price, String color) {
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	
	//멤버메서드
	public void info() {
		System.out.println("Name : "+this.name);
		System.out.println("Price : "+this.price);
		System.out.println("Color : "+this.color);
		System.out.println("====================");
	}
	
	public void test() {
		System.out.println("Phone이 클래스를 부르는 건지 생성자메서드를 부르는건지 모르겠다고");
	}


}
