package com.iu.j2.string.ex.member;

public class MemberMain {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		Member [] members = memberService.init();
		for(int i=0; i<members.length; i++) {
			System.out.println("id: " + members[i].getId()); //ID는 private이기때문에 getter쓰는것!
			System.out.println("pw: " + members[i].getPw());
			System.out.println("name: " + members[i].getName());
			System.out.println("-------------------------------");
		}
		
		Member[] users = memberService.init2();
		for(int i=0; i<members.length; i++) {
		System.out.println("id: " + users[i].getId());
		System.out.println("pw: " + users[i].getPw());
		System.out.println("name: " + users[i].getName());
		}
		
	}
}
