package com.iu.j3.file.ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentView {
	//view 메서드 
	//학생들의 정보 모두 출력
	public void view(List<Student> ar) {
		for(int i=0; i<ar.size(); i++) {						//리스트 ArrayList 안의 값을 출력하기 위한 반복문.  
			Student st = ar.get(i);								//리스트 안의 각각의 핸드폰을 가져오기 위한식. 인덱스로 각 칸에 접근
			
			System.out.println("name: "+st.getName());					//그안에 값을 하나씩 빼오는것!!
			System.out.println("number: " + st.getNum());
			System.out.println("Kor: "+ st.getKor());
			System.out.println("Eng: " + st.getEng());
			System.out.println("Math : " + st.getMath());
			System.out.println("Total: " + st.getTotal());
			System.out.println("AVG: " + st.getAvg());
			System.out.println("--------------------");
	}
		/* 향상된 for 문
		for(Student student: ar) {
			
		}*/
	}
		
	
	public void view(Student search) {
		System.out.println("name: "+search.getName());					//그안에 값을 하나씩 빼오는것!!
		System.out.println("number: " + search.getNum());
		System.out.println("Kor: "+ search.getKor());
		System.out.println("Eng: " + search.getEng());
		System.out.println("Math : " + search.getMath());
		System.out.println("Total: " + search.getTotal());
		System.out.println("AVG: " + search.getAvg());
		System.out.println("--------------------");
	}
	
}
