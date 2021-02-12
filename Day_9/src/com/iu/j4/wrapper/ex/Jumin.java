package com.iu.j4.wrapper.ex;

public class Jumin {
	//checkBirth method만들기
	//입력받은 주민번호 여기로 보내기
	//받은 번호로 나이를 계산 :앞에 두자리만 잘라서 2020에서 빼면됨.
	//뒤에번호가 1,2면 1900년대
	//뒤에번호가 3,4면 2000년대
	//태어난 계절 출력(3-5 봄/ 6-8 여름/ 9-11 가을 / 12-2 겨울)
	//-----------------------------------------------------
	public void checkBirth(String jumin) {	//main에서 입력받은 주민번호 가져옴
		String year = jumin.substring(0, 2); //주민번호의(0이상 2미만)자르기
		Integer y = Integer.parseInt(year);	 //string타입을 Integer로변환
		
		String month = jumin.substring(2, 4); //주민번호 2-4번째만 자르기
		Integer m = Integer.parseInt(month); //string to Integer
		
		char gender = jumin.charAt(7);		//뒷자리 첫번째 숫자 꺼내기
		
		if(gender =='1'|| gender=='2') {	
			int age = 2020 - (y+1900);		//나이계산
			System.out.println(age);		
		}else if(gender =='3' || gender=='4') {
			int age = 2020 - (y+2000);
			System.out.println(age);
		}else {
			System.out.println("wrong number");
		}
	
		//parseInt() 쓰면 알아서 안쓰는 앞에 0지워줌:month중 01-09때문에 고민했거든~
		if(m>=3 && m<=5) {	
			System.out.println("봄");
			
		}else if(m>=6 && m<=8 ) {
			System.out.println("여름");
		}else if(m>=9 && m<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
	}//method끝
	
	//checkJumin 
		// 9 0 1 2 1 0 - 1 2 3 4 5 6    7(체크번호)
		//*2 3 4 5 6 7 - 8 9 2 3 4 5       계산x
		//18+ 0+ 4+ 10+ 6+ 0+  8+ 18+ 6+ 12+ 20+ 30
		//=135(result)
		//1. 135(result)를 11 로 나눈 나머지 구하기(3) 
		//2. 11에서 나머지를 빼기 (11-나머지)=check
		//3. check값이 10이상이면 check값을 10으로 나눈 나머지와 체크번호가 일치하는지 비교
		//4. 10이상이 아니라면 check == 체크번호와 일치하는가?
	//-------------------------------------------------------------------------
	public void checkJumin(String jumin) { 	//parameter는 가져올 데이터타입입력, 변수명은 아무거나가능
		int sum = 0; 	//누적합계를 담으려는 변수
		int num = 2;	//2-9 더하는 값의 시작값을 정해주는거
		int check = Integer.parseInt(String.valueOf(jumin.charAt(13))); 
		//마지막 체크번호 꺼내놓기 :한문자 꺼내기 charAt -> 숫자로바꾸려는데 string을써야하니까 char->String->int순서로해줘야함..
		for(int i=0; i<jumin.length()-1; i++) {
			if(i==6) {			//"-"의 인덱스 - 계산X
				continue;		//"-"를 만났을때 바로 증감식으로 이동하라고 조건을 넣어주는것..ㅜㅜ크으..
			}
			if(num==10) {
				num=2; 			//2-9까지만 반복하게하기위해...ㅎ
			}
			sum = sum + Integer.parseInt(jumin.substring(i, i+1)) * num;	
			//charAt을 쓰고싶으면 Integer.parseInt(String.valueOf(jumin.charAt(i, i+1)))
			
			//문자열 출력됨->parseInt로 숫자로변경, 합계 계산
			num++;
		}
		int n = sum % 11;
		n = 11 - n;
		if(n>9) {
			n = n % 10;
		}
		String result = "잘못된 주민 번호";
		if(n == check) {
			result = "정상 발행 주민 번호";
		}
		System.out.println(result);
	}
}
