package com.iu.j2.string.ex.money;

import java.util.ArrayList;

public class MoneyView {
	MoneyService m = new MoneyService();
	ArrayList<Money> money = m.init();
	
	//method명 view : main에서 list를 받아와서 전체출력
	//다른 view : money객체의 내용 출력 :객체 하나만 출력하고 싶을때 쓰는 식
	//다른 view : 문자열을 받아서 출력해주는 method
	//오버로딩!
	
	public void view(ArrayList<Money> ar) {
		for(int i=0; i<ar.size(); i++) {						//리스트 ArrayList 안의 값을 출력하기 위한 반복문.  
			Money mm = ar.get(i);							//리스트 안의 각각의 핸드폰을 가져오기 위한식. 인덱스로 각 칸에 접근
			System.out.println(mm.getNation());					//그안에 값을 하나씩 빼오는것!!
			System.out.println(mm.getDon());
			System.out.println(mm.getSell());
			System.out.println(mm.getBuy());
			System.out.println("--------------------");
			}
	}
	
	
		public void view(Money search) {
			//Money money = null;
			if(search != null) {
				System.out.println("Nation : "+search.getNation());
				System.out.println("Don : "+search.getDon());
				System.out.println("Sell : "+search.getSell());
				System.out.println("Buy : "+search.getBuy());
			}else {
				System.out.println("정보가 없다...");
			}
		}
		
		
		
		
}

