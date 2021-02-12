package com.iu.j6;

public class Product {
	String name;
	int price;
	
	
	public boolean productEquals(Product product) {
		boolean result = false;
		if(this.name.equals(product.name) && this.price == product.price) {
			result = true;
		}
		return result;
	}
	
	public void info() {   //외부 데이터를 가져오려하면 ->매개변수 사용
		//참조변수 this : 객체를 가리키는 주소가 들어있는 변수
		//각 객체 생성시 만들어진 주소가 자동으로 들어감.
		//info 메서드를 사용하기위해 객체를 만들어야하는데, 
		//객체를 만들면 this에 주소가 자동으로 들어간다는 의미!!
		
		System.out.println(this);
		System.out.println(this.name);  //멤버변수 name
		System.out.println(name); // 지역변수 (매개변수?) name
		//this.name에서 this를 생략가능하지만, 지역변수가 우선순위기 때문에
		//생략하면 같은 것으로 생각함. this는 지역변수와 멤버변수를 구분할때 사용!!
		this.test(); //test의 주소를 this.test로 불러올 수 있음
	}
	
	public void test() {
		System.out.println("test Method");
	}






}//class끝

