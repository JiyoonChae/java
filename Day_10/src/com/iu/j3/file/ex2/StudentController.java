package com.iu.j3.file.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
	//start()
	//1.초기화
	//2.전체정보출력
	//3.학생검색
	//4. 종료
	Scanner sc = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	StudentView view = new StudentView();
	List<Student> student = null; 
	public void start() {
		boolean check = true;
		while(check) {
		System.out.println("1. 초기화");
		System.out.println("2. 전체정보출력");
		System.out.println("3. 학생 검색");
		System.out.println("4. 학생 추가");
		System.out.println("5. 종료");
		int select = sc.nextInt();
		
		
		switch(select) {
		case 1:
			student = dao.init();
			break;
		case 2:
			view.view(student);
			break;
		case 3:
			Student search = dao.studentSearch(student);
			view.view(search);
			break;
		case 4:
			dao.addStudent(student);
			break;
		case 5:
			check = !check;
			break;
			
			
		}
		
		}//while끝
	}
}
