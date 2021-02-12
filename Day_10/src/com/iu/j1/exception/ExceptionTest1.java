package com.iu.j1.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 5;
		int c = 0;
		
		try {
		System.out.println("정수 입력");
		int b = sc.nextInt();
			c = a/b;
			//throw new ArithmeticException(); 	//ArithmeticException 수학적 오류
		} catch (ArithmeticException e) { //exception이 발생하면 catch로 내려가고 발생안하면 안들어가고지나감
			System.out.println("0으로 나눌 수 없습니다");
		} catch(InputMismatchException i) {		//하나의 try에 여러개의 catch 사용 가능
			System.out.println("숫자만 입력하세요");
		} catch(Exception exception) {	//범위가 더 큰 부모 타입을 넣어줌으로써 혹시라도~ 놓치는 에러를 잡아줌 =>다형성...!!
			System.out.println("에러입니다~~");
		}
		
		System.out.println(c);
		
		
	}
}
