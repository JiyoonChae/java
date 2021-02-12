package com.iu.j6;

public class Car {
	String company;
	int price;
	
	public Car(String company, int price) {
		this.company= company;
		this.price= price;
	}
	
	public void info() {
		System.out.println(this.company);
		System.out.println(this.price);
	}
}
