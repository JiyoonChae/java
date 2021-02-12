package com.iu.j4;

import java.util.Scanner;

public class MemberInput {
	public Member [] init() {
		Member [] members = new Member[5]; //5칸짜리 array생성, 주소는 memebers에 저장
		for(int i=0; i<members.length; i++) {
			Member member = new Member(); //반복될때마다 새 객체생성 후 그안에 정보저장, array각 칸에 저장됨.
			member.id = "user" + i;
			member.pw = "pw" + i;
			member.name ="name" + i;
			members[i] = member;
		}
		return members;            //5칸짜리 array가 return될 것.
	} 
	//로그인 작업
	//id pw를 입력 받아서 로그인 작업 
	//login 이라는 method 만들기
	Scanner sc = new Scanner(System.in);
	
	public Member login(Member [] members) {      //argument = 5개짜리 배열을 매개변수로 받아서
		System.out.println("id를 입력하시오");
		String id=sc.next();
		System.out.println("pw를 입력하시오");
		String pw=sc.next();
		
		Member member = null;  //실패하면 null을 리턴.
		for(int i=0; i<members.length; i++) {
				if(members[i].id.equals(id) && members[i].pw.equals(pw)) {
					member = members[i];	//성공한 멤버의 데이터를 보내주려고함.
					break;
				}
				}
		return member;
	}
	
	
	
	
	
	
}//class끝
