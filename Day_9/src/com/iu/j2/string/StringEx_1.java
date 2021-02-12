package com.iu.j2.string;

import java.util.Scanner;

public class StringEx_1 {
	private Scanner sc;
	public StringEx_1() {
		sc = new Scanner(System.in); //생성자 딱한번선언. 선언시 스캐너 실행.
	}
	
	public void ex1() {
		//pw입력 : pw가 6글자 이상
		//영어 대문자 한글자 이상, 소문자 한글자 이상 꼭 포함.
		//boolean check = true;
		while(true) {		
		System.out.println("pw 입력");
		String pw = sc.next();
		int len = pw.length();
		boolean check = false;
		if(len >= 6) {
			//한글자씩 꺼내서 비교를 해봐야함.
			//대문자 하나 이상 있는지? 소문자 하나이상 소문자?
			check = true;
		}else {
			System.out.println("Fail");
		}
				int count1 =0; //대문자의 갯수
				int count2 =0; //소문자의 갯수
				if(check) {
					for(int i=0; i<len; i++) {
						char ch = pw.charAt(i);
						if(ch>=65&&ch<=90) {
							//대문자
							count1++;
							break;
						}						
						if(ch>=97 && ch<=122) {
							//소문자
							count2++;
							}
					} //for의 끝
				}//if의 끝
			if(check && count1>0 && count2>0 ) {
					System.out.println("OK");
				} else {
			System.out.println("다시입력하세요");
				}
		}//while 끝
	}
		public void ex2() {
			//문자열 입력 받아서
			//한글자씩 출력
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열 입력");
			String str = sc.next();
			for(int index=0; index<str.length(); index++) {
				char ch = str.charAt(index);
				System.out.println(ch);
			}
			
		}
		
		public void ex3() {
			//주민번호 : 201222-1234567 //-때문에 int로 받으면 substract로 계산해서 안됨.
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호 입력");
			String idnum = sc.next();
			char ch = idnum.charAt(7);
			
			if(ch=='1' || ch == '3') {
				System.out.println("남자");
			}else if(ch=='2' || ch=='4'){
				System.out.println("여자");
			}else {
				System.out.println("잘못입력");
			}
		}
		
		public void ex4() {
			//소문자 l 이 몇번 나오는지
			String str = "hello world land";
			//하나 찾고 그다음부터 찾기...count++
		/** 내가 만든 방법. 결과는 나오지만, indexOf를 안씀..ㅋㅋㅋ
			int count = 0;
			for(int index=0; index<str.length(); index++) {
				char ch = str.charAt(index);
			
				if(ch=='l') {
					count++;
				}
			}
			*/ 
			int idx= 0;
		//	idx = str.indexOf('l', idx); // 2
		//	idx = idx+1;
		//	idx = str.indexOf('l', idx);
		//	idx = idx+1;
		//	idx = str.indexOf('l', idx);
			int count = 0;
			while(idx != -1) {
				idx = str.indexOf('o', idx);
				if(idx != -1 ) {
					count++;
					idx = idx+1;	//이걸 도출을 못했음..ㅜㅜ
				}
			}
			System.out.println(count);
		}
		
		public void ex5() {
			//파일명 입력 확장자 포함 
			//test.txt, iu.jpg..
			//이미지 파일인지 아닌지  jpg, gif, png
			//문자열에서 확장자만 잘라내기.
			//.+1, .+3
			System.out.println("파일명 입력");
			String str = sc.next();
			int idx = str.indexOf('.');
			//String name = str.substring(str.lastIndexOf(".")+1);
			str = str.substring(idx+1, idx+4);
			System.out.println(str);
			
			if(str.equals("png") || str.equals("gif") || str.equals("jpg")) {
				System.out.println("이미지파일");
			}else {
				System.out.println("이미지 파일 아님");
			}
		/*
			선생님방법
			String [] files ={"jpg", "gif", "png"};
			 boolean check = false;
			for(int i=0; i<files.length; i++) {
				if(name.equals(files[i])) {
					check =true; 
					break;
					} 
			}
			if(check=true) {
				System.out.println("이미지파일");   
			}else {
			  System.out.println("이미지파일이 아님")
			 }
			 */
		}
		
	
}
