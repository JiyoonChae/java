package com.iu.j1;

public class Basic_2 {

		public static void main(String [] args) {
			System.out.println("Basic2 실행");
			
			System.out.print("print1");
			//print는 다음 메서드가 바로 출력됨. 줄바꿈 x.
			System.out.println("print2");
			//println은 줄바꿈됨.
			
			System.out.println("오늘 점심은 \"김밥\"");
			//강조를 위해 ""를 사용하고 싶을 경우 \" \" 이렇게 사용해야함.
			
			System.out.println("성적 \t F"); //\t는 간격을 만듦. tab누르는 효과.
			
			System.out.println("오늘은 월요일 \n 내일은 금욜 이었으면 좋겠다...");
			// \n은 엔터치는 것과 같은 효과. 줄바꿈!
			
			System.out.println("Basic2 종료");
		}
}
