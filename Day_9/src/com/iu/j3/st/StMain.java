package com.iu.j3.st;

import java.util.StringTokenizer;

public class StMain {
	public static void main(String[] args) {
		String str="iu-20-choa-30-hani-28-suji-25-kim-22";
		StringTokenizer st = new StringTokenizer(str, "-"); //(자를문자열, 기준)
		System.out.println(st.countTokens());
		
		//String name = st.nextToken(); //자를 기준을 여기서 넣어줘도 됌
		//System.out.println(name);
		//System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
			System.out.println(name);
			System.out.println(age);
		}
		
		
	}
}
