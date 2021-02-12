package com.iu.j6;

public class ProductMain {
	public static void main(String[] args) {
		Product product = new Product();
		product.name = "갤럭시 노트 20";
		product.price=100;
		
		Product product2 = new Product();
		product2.name = "갤럭시 노트 20";
		product2.price=100;
	
		product.productEquals(product2);
		
		System.out.println(product == product2); //주소 비교
		
		System.out.println(product);
		product.info();
		
		System.out.println(product2);
		product2.info();
		
	}
}
