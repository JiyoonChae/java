package com.iu.s1.view;

import java.util.ArrayList;

import com.iu.s1.student.Student;

public class StudentView {
	private ArrayList<Student> students;
	
	public void view(String message) {
		System.out.println("받은 메세지 : " + message);
	}
	
	public void view(Student student) {
		System.out.print(student.getName() + "\t");
		System.out.print(student.getNum() + "\t");
		System.out.print(student.getKor() + "\t");
		System.out.print(student.getEng() + "\t");
		System.out.print(student.getMath() + "\t");
		System.out.print(student.getTotal() + "\t");
		System.out.printf("%.2f \n", student.getAvg());
	}
	public void view(ArrayList<Student> students) {
		System.out.println("Name\t"+"Num\t"+"Kor\t"+"Eng\t"+"Math\t"+"Total\t"+"Avg\t");
		System.out.println("========================================================");
		for(int i=0; i<students.size(); i++) {
			Student student = new Student();
			student = students.get(i);
			this.view(student);
		}
		System.out.println("========================================================");
		
	}
}
