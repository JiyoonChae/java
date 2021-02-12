package com.iu.j4;

import java.util.Scanner;

import com.iu.j3.ReturnModel;

public class SchoolController {
	//start메서드 선언 
	//1. 학생 정보 입력
	//2. 학생 정보 출력
	//3. 학생 정보 검색
	//4. 프로그램 종료
	//main에서 호출
	 public void start() {
		 Scanner sc = new Scanner(System.in);
		 StudentInput input = new StudentInput(); 
		 //객체1번만 선언하고 메서드를 여러번 호출할 수 있으니까 반복하지않게 객체를 바깥에 선언한것.
		 Student [] students =null; //한번 선언하고 계속쓰기위해  바깥에 선언.
		 StudentOutput output = new StudentOutput();
		 boolean check = true;
		 while(check) {
		 System.out.println("1. 학생 정보 입력");
		 System.out.println("2. 학생 정보 출력");
		 System.out.println("3. 학생 정보 검색");
		 System.out.println("4. 프로그램종료");
		 int select = sc.nextInt();
		 
		 if(select==1) {
			 System.out.println("입력");
			 students = input.makeStudent(); //makeStudent()메서드 호출하는 식.
		 }else if(select ==2) {
			 output.viewAll(students);       //저장된 students 배열 데이터를 viewAll method로 보내줌!
		 }else if(select ==3) {
			 Student student = input.search(students);
			 if(student != null) {
				 output.viewOne(student); 
				 }else {output.viewMessage("없는 학생이다");
				 }
			 //학생번호 있으면 viewOne으로 가고, 없으면 viewMessage로 가라는 컨트롤을 해줘야함. 
		 }else {
			 System.out.println("종료");
			break;
		 }
		 
		 }//while 끝
	 }//start끝
	
}
