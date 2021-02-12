package com.iu.j4;

public class MemberOutput {
	//viewMessage 문자열 출력
	//로그인 성공 /실패 등 결과물, 로그아웃 메세지
	public void viewMessage(String message) {
		System.out.println(message);
		
	}
	
	//viewMember 
	//mypage 눌렀을때 멤버의 정보 출력  id, pw, name 출력
	public void viewMember(Member member) {
		 System.out.println("Id \t Pw \t Name ");
			System.out.print(member.id +"\t");
			System.out.print(member.pw +"\t");
			System.out.println(member.name +"\t");
		
		}
	
	
}
