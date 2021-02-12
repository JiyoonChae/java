package com.iu.j2.string.ex.money;

import java.util.ArrayList;

public class MoneyMain {
	public static void main(String[] args) {
		MoneyService m = new MoneyService(); 				//멤버메서드 이용을 위해 객체생성 (메서드가 들어있는 클래스)
		MoneyController c = new MoneyController();
		c.start();
		//Money[] money = m.init();							//멤버메서드를 호출 => return하는 값과 동일한 클래스명 아무변수명 = 클래스객체.멤버메서드명() 
	//<Money> money = m.init();					//멤버메서드를 호출  
		
		//	m.moneyAdd(money);
		/*
		for(int i=0; i<money.length; i++) {						//배열 array 안의 값을 출력하기 위한 반복문. 인덱스로 각 칸에 접근, 그안에 값을 하나씩 빼오는것!!
			System.out.println(money[i].getNation());
			System.out.println(money[i].getDon());
			System.out.println(money[i].getSell());
			System.out.println(money[i].getBuy());
			System.out.println("--------------------");
		}*/
		/*
		m.moneyDelete(money);
		for(int i=0; i<money.size(); i++) {						//리스트 ArrayList 안의 값을 출력하기 위한 반복문.  
			Money mm = money.get(i);							//리스트 안의 각각의 핸드폰을 가져오기 위한식. 인덱스로 각 칸에 접근
			System.out.println(mm.getNation());					//그안에 값을 하나씩 빼오는것!!
			System.out.println(mm.getDon());
			System.out.println(mm.getSell());
			System.out.println(mm.getBuy());
			System.out.println("--------------------");
		}
		
		m.moneySearch(money);
		*/
		
	
	}
}
