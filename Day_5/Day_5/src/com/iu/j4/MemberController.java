package com.iu.j4;

import java.util.Scanner;

public class MemberController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		MemberInput memberInput = new MemberInput(); //init()메서드를 쓰기위해 객체생성
		Member [] members = memberInput.init(); 
		// 아까 5칸짜리 array의 주소가 members에 저장됨. 가져오는것~ ,init = 초기화를 나타내는 변수명
		Member member = null;
		MemberOutput output = new MemberOutput(); 
		//viewMessage, viewMember()메서드를 쓰기위해 객체생성.
		boolean check = true;
		int num = 0;
		
		while(check) {
			if(member ==null) {
				System.out.println("1. 로그인");
				System.out.println("2. 프로그램 종료");
				num =sc.nextInt(); 
					if(num == 1) {
						member = memberInput.login(members);
						String message = "로그인실패";
						//output.viewMessage("로그인 실패");
						
						if(member != null) {
							message = "로그인성공";
							//output.viewMessage("로그인 성공");
						}
						output.viewMessage(message);
					}else {
						System.out.println("프로그램 종료");
						break;
					}
						
					
				/*switch(num) {
				case 1:
					
					member = memberInput.login(members);
					
					output.viewMessage(member);
					
					break;
				case 2:
					 System.out.println("프로그램 종료");
					 check = !check;
					break;
				}  내가쓴 거*/ 
			}else {
				System.out.println("1. 로그아웃");
				System.out.println("2. My Page");
				System.out.println("3. 성적 관리");
				num =sc.nextInt(); 
				switch(num) {
				case 1:
					output.viewMessage("로그아웃");
					check = !check;
					break;
				case 2:
					 System.out.println("my page");
					 output.viewMember(member);
					break;
				case 3:
					SchoolController grade = new SchoolController();
					grade.start();
					break;
				}
			}
			
			
			
		
			
		}//while끝
		
		
		
		//로그인 x
		//1. 로그인 : id, pw 일치하는 것 찾기 
		//controller 에서 성공/ 실패 찾기 
		//2. 프로그램종료 
		//로그인 o
		//1.로그아웃
		//2.mypage 보기
		
		}
}
