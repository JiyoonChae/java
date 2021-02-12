package com.iu.j2.string.ex.money;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyController {
	//method start -> main에서 실행!
	//moneyService, moneyview연결 하려고함......!!!
	//1. 초기화  : init() 호출
	//2. 전체정보출력 : view() 호출
	//3. 검색 :moneySearch() 실행 -controller - 결과물 view() 
	//4. 추가 : moneyAdd() 실행  
	//5. 삭제 : moneyDelete() 실행
	//6. 종료 
	public void start() {
		MoneyService m = new MoneyService(); 
		MoneyView v = new MoneyView();
		ArrayList<Money> money = m.init();
		//Money search = m.moneySearch(money);
	
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(check) {
			System.out.println("1. 초기화");
			System.out.println("2. 전체정보출력");
			System.out.println("3. 검색");
			System.out.println("4. 추가");
			System.out.println("5. 삭제");
			System.out.println("6. 종료");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				money = m.init();	
				break;
			case 2:
				v.view(money);
			
				break;
			case 3:
				Money search = m.moneySearch(money);
				v.view(search);
				break;
			case 4:
				m.moneyAdd(money);
				break;
			case 5:
				m.moneyDelete(money);
				break;
			default :
				check = false;
				break;
			}
			
		}
		
	}
	
}
