package com.iu.j1;

import java.util.Scanner;

public class J1Main {
	 public static void main(String[] args) {
		//1.학생정보등록
		//  학생 수를 입력
		//  학생 수 만큼 번호,이름,국어,영어,수학 점수를 입력
		//2. 학생 정보 출력 (정렬 전)
		//3. 성적순 출력 - 평균순 (정렬 후)
		 //option : 같은 평균이면 국어 점수가 더 높은 사람이 먼저나오게 
		//4. 프로그램 종료
		 Scanner sc = new Scanner(System.in);
		 	//a.입력받기 위해 먼저 스캐너 준비.
			//b.프린트문 만들기.
			//c.번호 하나를 입력받기위해 sc.nextInt();
			//d.반복해야하니까 for/while중에 결정 : 횟수 정해짐 for/ 횟수 정해지지않음 while
			//e.4개 옵션 중 하나를 선택하는 거니까 if else / swich를 써야함 :이경우는 swich가 더 나음.
			//f.4번 누르면 종료해야하는데 switch안에 break는 반복을 종료시키지않음, 그래서 조건문을 false로 만드는 조건식 써주기.
		 Student [] star = null;
		 Student [] students = null;
		 boolean check = true;
			while(check) {
				System.out.println("1.학생정보입력");
				System.out.println("2.학생정보출력");
				System.out.println("3.성적순 출력");
				System.out.println("4.프로그램종료");
				int num = sc.nextInt(); //위에 1-4까지 중에 하나고르기.
				
			//선생님이 만든거
			if(num == 1)	{
				System.out.println("학생수를 입력하세요");
				num = sc.nextInt(); //학생수를 받는 변수
				//학생을 모을 배열 만들기, Student(=class) : 번호,이름,국어,영어,수학,총점,평균
				students = new Student[num];
				
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
			}else if(num == 2) {
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
			}else if(num == 3) {
				Student [] copy = new Student[students.length];
				for(int i=0; i<copy.length; i++) {
					copy[i] = students[i];
				}
				System.out.println("성적순");
				//임시변수에 담아놓고 자리바꾸기 반복하면됨. 그안에 if조건문에 크기비교 넣어줌.
					for(int i=0; i<copy.length-1; i++) {
						for(int j=i+1; j<copy.length; j++){
							if(copy[i].avg < copy[j].avg) {
								Student tmp = copy[i];
								copy[i] = copy[j];
								copy[j] = tmp;
							}	
						}
					}//정렬 for 끝
				System.out.println("Num \t Name \t Kor \t Eng \t Math \t Total \t Avg ");
					for(int i=0; i<copy.length; i++) {
						System.out.print(copy[i].num +"\t");
						System.out.print(copy[i].name +"\t");
						System.out.print(copy[i].kor +"\t");
						System.out.print(copy[i].eng +"\t");
						System.out.print(copy[i].math +"\t");
						System.out.print(copy[i].total +"\t");
						System.out.println(copy[i].avg +"\t");
					}
			}else {
				System.out.println("종료중--- ");
				break;
			}
		
			
	/**	
			//내가 만든 거
			
			switch(num){
				case 1:
					//학생수 입력, 학생수만큼 번호 이름 국어 영어 수학 점수 입력
					System.out.println("학생 수 입력");
					int num2 = sc.nextInt();
					
					star = new Student[num2];
					for(int i=0; i<num2; i++) {
					 Student st = new Student();
						System.out.println("번호 입력");
						st.num = sc.nextInt();
						System.out.println("이름 입력");
						st.name = sc.next();
						System.out.println("국어 점수 입력");
						st.kor = sc.nextInt();
						System.out.println("영어 점수 입력");
						st.eng = sc.nextInt();
						System.out.println("수학 점수 입력");
						st.math = sc.nextInt();
						
						st.total = st.kor+st.eng+st.math;
						   System.out.println("총점: " + st.total);
						st.avg = st.total / 3;
						   System.out.println("총점: " + st.avg);
						star[i]= st;
				}
					break;
				case 2:
					System.out.println("2.학생정보출력");
				 for (int i = 0; i < star.length; i++) {
					      System.out.println("번호:"+star[i].num+" 이름:"+star[i].name+" 국어:"+star[i].kor+" 영어:"+star[i].eng+" 수학:"+star[i].math+" 총점: " +star[i].total+" 평균: "+star[i].avg);
					 }
					break;
					
				case 3:
					System.out.println("3.성적순 출력");
					double tmp =0;
					for(int index=0; index<star.length-1; index++) {
						for(int i=index+1; i<star.length; i++) {
							if(star[index].avg < star[i].avg) {
							Student tmp=star[index];
							star[index]=star[i];
							star[i]=tmp;
							}//if
						}//for 안쪽
					}//for 바깥쪽
					
					for(int i=0; i<star.length; i++) {
						System.out.println(star[i].avg);
						}
					break;
				default: 
					System.out.println("잘못 누름");
					check =! check;
					
			} */
		} 
	 
			System.out.println("프로그램 종료");
	 }//main의 끝
}


