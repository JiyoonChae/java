package com.iu.j5;

public class Shop {
	//main 에서 구매할 물건의 총 합계 금액 입력받기
	//총 합계 금액의 5% 할인 
	//더블할인 3% 추가할인! 
	//할인금액 만들어주는 method 만들기
	//main에서 할인이 다 끝난 결제금액 출력
	public double discount(double cost, double dis1) {   //3.discount()라는 메서드 안에 2개의 매개변수 (총금액, 할인율) 생성
		double d =cost - cost * dis1;                    //4.계산할 식! d는그냥 식의 이름, 총금액에서 할인액을 빼고 지불할 금액 d를 출력
		return d;										 //5.계산된 금액을 프린트해야하니까 return을 해줌, main에서 쓸 수 있게.
	}
	public double dbdiscount(double cost2, double dis2) {
		double d2 = cost2 - cost2 * dis2;
		return d2;
	}
	
	public double cal3(double money, double count){
        money = money- money*count;
        		return money;
	}
}
