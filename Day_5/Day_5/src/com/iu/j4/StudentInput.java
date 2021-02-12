package com.iu.j4;

import java.util.Scanner;


public class StudentInput {
	Scanner sc = new Scanner(System.in);
	//makeStudnet 메서드 만들기
	//내용은 학생들 정보를 받음.
	//입력을 받은후 정보를 controller로 되돌려줌
	public Student[] makeStudent() {
		System.out.println("학생수를 입력하세요");
		int num = sc.nextInt(); //학생수를 받는 변수
		//학생을 모을 배열 만들기, Student(=class) : 번호,이름,국어,영어,수학,총점,평균
		Student[] students = new Student[num]; // student[]가 모든데이터가 든 주소를 가지고 있으니까 이걸 따라가면 데이터 접근 가능
		
		for(int i=0; i<students.length; i++) {
			Student student = new Student(); 
			System.out.println("번호를 입력");
			student.num = sc.nextInt();
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("국어 점수 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 점수 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 점수 입력");
			student.math = sc.nextInt();
			student.total = student.kor+student.eng+student.math;
			   System.out.println("총점: " + student.total);
			   student.avg = student.total / 3.0;
			   System.out.println("총점: " + student.avg);
			   students[i]=student; 
	}
		return students; //주소를 찾을 수 있게 주소를 return
}
	
	//search method 만들기
	//검색할 학생번호 입력받기
	//학생을 찾아서 리턴하기
	public Student search(Student [] students) {  //모든데이터가 담긴 array의 주소를 매개변수로 받음
		System.out.println("검색할 학생 번호를 입력하세요");
		int num = sc.nextInt(); //학생번호를 받는 변수
		//int student = 0; 나는 그냥 int로 student의 배열 자리값을 출력했는데
		Student student = null; //Student 타입을 넣어서 배열 자체를 출력할 수 있음:)!!
		for(int i=0; i<students.length; i++) {
			if(num==students[i].num) {
				student = students[i];         //위에서 모든데이터가 담긴 array를 반복해서 입력받은 num값과 같은 array index검색, 
				break;						//num과 같은 번호가 들어있는 자리(index)안의 모든 데이터를 student에 저장하는것!!!	
			}
			}
		return student;
	
	}
		
}
	
