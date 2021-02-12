package com.iu.j3.file.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;



public class StudentDAO {
	Scanner sc = new Scanner(System.in);
		//INIT 메서드 만들기
		// test.txt 파일 내용을 읽어서 
		//student정보를 파싱해서 ..  student 객체를 생성하여 전부 리턴
		public List<Student> init() {
			File file = new File("c:\\test1", "test.txt");			//1. 데이터 담고있는 파일의 경로
			FileReader fr =null;									//2. 파일 읽기
			BufferedReader br = null;
			String str =null;
			String st = null;
		
		 StringTokenizer strz = null;
		 List<Student> ar = new ArrayList<>();					//ArrayList(), LinkedList() 모두 받을수있는 부모 List()타입으로 선언해주는것.
			
		 try {
				fr = new FileReader(file);							//2. 파일 읽기 -진짜 있는지 확인하는 메서드 :fr.exist()
				br = new BufferedReader(fr); 						// 문장을 읽기 위해서 보조 스트림 필요
				
				while(true) {
					str = br.readLine();	//exception 타입이 다르면 내부적으로 계속 exception경고가뜸, 더 큰 범위의 타입으로 바꾸면됨.
					
					if(str==null) {
						break;
					}
					
					//System.out.println(str);
			/*		
					//파싱 작업 - split 
					String [] ar = str.split(",");
					Student student = new Student();
					student.setName(ar[0].trim());
					student.setNum(Integer.parseInt(ar[1].trim()));
					student.setKor(Integer.parseInt(ar[2].trim()));
					student.setEng(Integer.parseInt(ar[3].trim()));
					student.setMath(Integer.parseInt(ar[4].trim()));
					student.setTotal(student.getKor()+student.getEng()+student.getMath());
					student.setAvg(student.getTotal()/3.0);
			*/		
					
					
					strz = new StringTokenizer(str, ",");			//파싱 작업
					int index = 0;											//생성한 array의 index에 접근하기 위해 변수선언
					while(strz.hasMoreTokens()) {							//각 token을 체크해서 다음 token이 있는지 없는 지 확인 후 true/false를 리턴하는 메서드=hasMoreTokens()
						Student student = new Student();							//새로운 객체생성 for 나라당 필요한 정보만 넣기위해	
						student.setName(strz.nextToken());					//객체.token입력 nation은 원래 string 타입이라 바로 넣으면됨.
					//	String trim = strz.nextToken().trim();				//다음 token은 " 1000"이라서 space를 삭제하기 위해 trim() 을 사용 
						
						student.setNum(Integer.parseInt(strz.nextToken().trim()));				//객체.다음token(string을 Integer로 변환하여) 삽입.
					
						student.setKor(Integer.parseInt(strz.nextToken().trim()));
						student.setEng(Integer.parseInt(strz.nextToken().trim()));
						student.setMath(Integer.parseInt(strz.nextToken().trim()));
						
						student.setTotal(student.getKor()+student.getEng()+student.getMath());
						student.setAvg(student.getTotal()/3);
						ar.add(student);
					}
						
			
				}//while끝
	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {								//해제 순서는 연결된 역순
					br.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		 return ar;
			
		}//init끝
		
		public Student studentSearch(List<Student> ar) {
			
			System.out.println("검색할 학생명 입력");
			String name = sc.next();
			
			
			Student student =null;
			for(int i=0;i<ar.size();i++) {
				if(name.equals(ar.get(i).getName())) {
					student = ar.get(i);
					break;
				}
			}
			
			return student;
		}
		/*
		//addStudent 메서드(매개변수:리스트)
		//학생정보 추가
		//이름, 번호, 국어, 영어, 수학 입력
		//LIST, FILE 에 까지 추가되어서 초기화했을때도 추가된 정보가 날아가지않아아 함
		public void addStudent(List<Student> ar) {
			
			File file = new File("c:\\test1", "test.txt");
			FileWriter fw = null;
			try {
				
				System.out.println("학생 정보 추가");
				System.out.println("이름, 번호, 국어, 영어, 수학");
				 String newst = sc.next();
				fw = new FileWriter(file, true);
				fw.write(newst+"\r\n");    //r은 커서를 앞으로 땡겨옴, n은 밑으로내리는것.
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {		//finally는 예외발생여부 상관없이 무조건 실행됨, 연결을 해제시켜주는 역할
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	 
			
			
		}*/
		
		//addStudent 메서드
		//list를 받아서
		//학생정보 추가
		//이름, 번호, 국어, 영어, 수학 입력 
		//list 추가, 파일에도 추가
		//
		public void addStudent(List<Student> students) {
			
			Student student = new Student();
			System.out.println("Name 입력");
			student.setName(sc.next());
			System.out.println("Num 입력");
			student.setNum(sc.nextInt());
			System.out.println("Kor 입력");
			student.setKor(sc.nextInt());
			System.out.println("Eng 입력");
			student.setEng(sc.nextInt());
			System.out.println("Math 입력");
			student.setMath(sc.nextInt());
			student.setTotal(student.getKor()+student.getEng()+student.getMath());
			student.setAvg(student.getTotal()/3.0);
			//file
			File file = new File("c:\\test1", "test.txt");
			FileWriter fw = null;
			
			try {
				fw = new FileWriter(file, true);
				StringBuffer sb = new StringBuffer();
				sb.append(student.getName());
				sb.append(",");
				sb.append(student.getNum());
				sb.append(",");
				sb.append(student.getKor());
				sb.append(",");
				sb.append(student.getEng());
				sb.append(",");
				sb.append(student.getMath());
				
				fw.write(sb.toString()+"\r\n");
				students.add(student);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//list
			
		}
		 //deleteStudent 
		//학생의 이름을 받아서 list에서 삭제
		//리스트를 파일에 덮어씌우기?!!
}
