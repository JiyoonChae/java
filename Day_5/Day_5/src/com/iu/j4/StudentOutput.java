package com.iu.j4;

import java.util.Scanner;

public class StudentOutput {
	//viewAll method생성해서
	//학생들의 정보를 받아서 출력.
	public void viewAll(Student [] students) {                   //StudentInput에서 만든 데이터[]자체를 매개변수로 가져옴
		 System.out.println("Num \t Name \t Kor \t Eng \t Math \t Total \t Avg ");
			for(int i=0; i<students.length; i++) {
				System.out.print(students[i].num +"\t");
				System.out.print(students[i].name +"\t");
				System.out.print(students[i].kor +"\t");
				System.out.print(students[i].eng +"\t");
				System.out.print(students[i].math +"\t");
				System.out.print(students[i].total +"\t");
				System.out.println(students[i].avg +"\t");
			}
	}

	//viewOne method생성
	//학생 한명의 정보를 받아서 출력
	
	public void viewOne(Student student) {
			
			 System.out.println("Num \t Name \t Kor \t Eng \t Math \t Total \t Avg ");
					System.out.print(student.num +"\t");
					System.out.print(student.name +"\t");
					System.out.print(student.kor +"\t");
					System.out.print(student.eng +"\t");
					System.out.print(student.math +"\t");
					System.out.print(student.total +"\t");
					System.out.println(student.avg +"\t");
				
				}
	
	//viewMessage method만들고 문자열 메시지 받아서 출력
	public void viewMessage(String message) {
		System.out.println(message);
		//슨생님이하면 왜케쉽냐,,
	}
		
}
