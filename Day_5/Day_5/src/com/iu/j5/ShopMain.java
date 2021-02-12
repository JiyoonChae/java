package com.iu.j5;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 1.총액을 입력받기 위해 scanner만들기
		System.out.println("총합계 입력");
		double total = sc.nextDouble();      // 2.입력받은 값의 이름 : total이라고 설정
		
		Shop s = new Shop();					//6. method를 사용하기위해 객체선언
		double cost = s.discount(total, 0.05);  //7. method 호출! 타입, 변수명 = 객체명.메서드명(계산할 값들~)
		System.out.println(cost);				//8. method안에 있는 식을 통해 계산된 최종 금액 d를 return했잖아~ 그걸 프린트해주는것!
		
		double cost2 = s.dbdiscount(cost, 0.03); 
		System.out.println(cost2);

		
		//------------------------------------------
		System.out.println("총합계 입력");
		total = sc.nextInt();
		
		cost = s.cal3(total, 0.05);
		cost2 = s.cal3(cost, 0.03);
		
	}

}
