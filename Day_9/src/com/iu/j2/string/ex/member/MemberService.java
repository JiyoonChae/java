package com.iu.j2.string.ex.member;

import java.util.StringTokenizer;

public class MemberService {
	private String members;
	
	public MemberService() {
		//생성자가 하는일?! 복습하기
		members = "user01,pw01,name01, user02,pw02,name02, user03, pw03, name03";
		
	}
	
	//init method
	//하는일 : members데이터 잘라서 user01-id변수에 넣고, pw01은 pw 변수에 넣고.....쭉~
	//객체생성, 넣고 배열만들어서 return 
	
	public Member[] init() {
		String [] member = members.split(",");
	
		Member [] members = new Member[member.length/3];
	//	int index =0;
		for(int i=0; i<member.length; i=i+3) {
			Member user = new Member();
			user.setId(member[i]);
			user.setPw(member[i+1]);
			user.setName(member[i+2]);
			members[i/3] = user; 
	//		members[index]=user; //이렇게 쓸수도 있음..패턴을 찾아야함!!! 
	//		index++;			 //이건 index라는 변수를 또 선언해줘야하니까 메모리를 더차지함.
		} 
		return members;
	
	}
		
	public Member[] init2() {									//메서드 생성, 리턴타입은 리턴결과에 맞춰 마지막에 수정
		StringTokenizer st = new StringTokenizer(members, ",");	//StringTokenizer는 Scanner처럼 import를 받아와야함!! (문자열, 구분자)
		System.out.println(st);									//프린트하면 주소가 출력됨
		System.out.println(st.countTokens());					//몇번 자를 건지 카운트해줌
		Member[] ar = new Member[st.countTokens()/3];			//새로운 array를 생성
		int index = 0; //ar배열의 인덱스를 만들어주는것
		while(st.hasMoreTokens()) {			//token이 더있을때 까지 돌리라는 의미.
			Member user = new Member();
			user.setId(st.nextToken());			//출력되는 token을 setId의 값으로 할당하여 user객체에 넣는것.
			user.setPw(st.nextToken());
			user.setName(st.nextToken());
			ar[index] = user;
			index++;		//배열인덱스 계산안하고 자르고싶은 갯수가 일정하면 token쓰는게 편함 split보다.
		}
		return ar;
	}

	
	
}
