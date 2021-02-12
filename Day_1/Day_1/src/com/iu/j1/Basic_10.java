package com.iu.j1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic_10 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//국어,영어, 수학 입력받아서 총점, 평균 계산 후 출력
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		
		System.out.print("총점:");
		System.out.println(kor+math+eng);
		double avg = (kor+math+eng) / (double)3;
		
		System.out.println("평균:" + avg);
		double temp = avg * 100;
		System.out.println(temp);
		double temp2 = (int)(temp * 0.01);
		System.out.println(temp2);
		
	   /*선생님 답
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		total = kor+eng+math;
		
		double avg = (double)total / 3;   */
	}
}
