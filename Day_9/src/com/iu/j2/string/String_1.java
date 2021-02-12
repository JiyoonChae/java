package com.iu.j2.string;

public class String_1 {
	public static void main(String[] args) {
		//int a를 사용하기위해 객체부터 선언
	//	Test test = new Test();
		//member에 접근 : 참조변수명.멤버변수/메서드
	//	test.a = 10; //값을 입력
	//	System.out.println(test.a); //값을 출력
		
		//static붙은 클래스변수니까 객체선언 안해도됨.
	//	Test.name = "s"; //클래스명.변수명(객체없이 가능), 값을 입력
	//	String n = Test.name; // 값을 출력
	//	System.out.println(n);
		
	//	System.out.println(String.CASE_INSENSITIVE_ORDER);
		//이 변수가 static이 붙은 클래스 변수니까, 클래스이름 String.변수이름
		//으로 바로 사용가능한 것!!
		
		
		/*
		String str = new String("hello");
		System.out.println(str); //str 주소값.
		String str2 = "hello"; //원래는 첫번째께 맞음.
		System.out.println(str2);
		System.out.println((str == str2));
		
		int leng = str.length();
		System.out.println(leng);
	*/
		StringEx_1 e1 = new StringEx_1(); //string class는 이렇게 만들어야하는데
		//String str = "" ; 이렇게 만들어도 상관없다~
		
	//	e1.ex1();
		
	//	String str ="Hello World"; 	
	//	char ch = str.charAt(str.length()-1);
	//	System.out.println(ch);
		
	//	e1.ex2();
	//	e1.ex3();
	//	String str ="Hello World"; //String class 생성
	//	int sth = str.indexOf('o', 6);	//메서드 사용
	//	System.out.println(sth);
		
	//	e1.ex4();
		
	//	String str = "Hello World JIYOON";
	//	String a = str.substring(6, 9);
	//	System.out.println(a);
	
	//	e1.ex5();
			
	//	String str="iu-choa-suji-hani";
	//	String[] names = str.split("-");
				//parcing 문자열을 어떤 기준을 가지고 자르는 것
	//	for(int i=0; i<names.length; i++) {
	//		System.out.println(names[i]);
	//	}
		
		
	//	int num = 10;
	//	String str = String.valueOf(num);//int ->String
	//	System.out.println(str);
	//	System.out.println(1+1);
	//	System.out.println("1"+1);
	//	str = "1"+1;
	//	str = 10+""; //이렇게써도 int를 string으로 바꿀수 있음
		
	//	여러개문자열 더해서 하나의 문자열로
	//	"hello"+"world"; ->객체 3개가 생성됨. 더한거는 새로 만듦.
	/*
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
		//이렇게 쓰기만 해도 더하기를 실행하라는 의미가 있음.
		System.out.println(sb); //원랜 주소값이 나와야하는데 오버라이드를 했기때문에 결과가 출력됨..
		//sb출력값이 문자열이라서 String타입에 assign하려고 하면 에러남.
		String str = sb.toString();
	*/
		/*
		String str = "hello world"; // l을 r로 바꾸기
		String re = str.replace('l', 'r');
		System.out.println(re);
		
		str = "today is work day";
		re = str.replace("work", "holi");
		System.out.println(re);
		*/
	}
		
}
