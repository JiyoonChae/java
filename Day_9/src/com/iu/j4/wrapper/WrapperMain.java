package com.iu.j4.wrapper;

public class WrapperMain {
	public static void main(String[] args) {
		//Wrapper 예시
		/*
		System.out.println(Integer.BYTES);		//int의 크기 4byte를 출력.
		System.out.println(Integer.MAX_VALUE); 	//표현할 수 있는 최대수
		System.out.println(Integer.MIN_VALUE);	//표현할 수 있는 최소수
		System.out.println(Integer.SIZE);		//사용할수있는 bit
		
		System.out.println(Double.BYTES);
		System.out.println(Long.BYTES);
		*/
		
		/*
		String age = "20";
		//System.out.println(age*2); 에러남,, 근데 할수있음.
		int age2 = 30; 		//primitive int 를 class 변수로 바꾸고싶을때. 클래스메서드 사용가능해짐.
		Integer num1 = new Integer(age); //String을 Integer로 변환.
		Integer num2 = new Integer(age2); //int를 Integer로 변환.
		int n1 = num1.intValue();	//Integer를 다시 int로 변환하는것. ->int 20
		int n2 = num2.intValue();
		System.out.println(n1*2);	// 그래서 20*2 한 값이 출력됨.
		System.out.println(n2*2);
		
		String ki = "182.36";
		Double d1 = new Double(ki); //string to Double클래스 변수
		double d2 = d1.doubleValue();// Double to double primitive변수
		System.out.println(d2); 
		*/
		
		char ch = '1';
		//String st = String.valueOf(ch);
		String s = ch+""; 	//이렇게 해도 char를 String으로 변환, "1"출력가능.
		//Integer d3 = new Integer(ch);  //ch가 int형으로 자동형변환 됨. 아스키코드.
		Integer d3 = new Integer(s);	//"1" -> class변수 Integer 1
		int r = d3.intValue();			// Interger -> primitive int 1로.
		System.out.println(r);
		
		s= "570";						//string으로 들어오는 데이터들의 타입을 바꿀때 가장많이 사용!!!
		//parseInt
		int in = Integer.parseInt(s); //풀어쓰면 Integer.intValue()를 한번에 다쓴거! 위에는 코드3줄 쓴걸 한줄로 끝낼수있음.
		System.out.println(in*2);
		
		Integer n = new Integer(10);	//reference 타입
		int nums = 20;					//primitive 타입
		n = nums;			//pri를 ref로 바꾸려고함, 근데 원래 들어가면 안되는데 들어감... 
		//같은 종류끼리만 가능!! => primitive ->reference : auto boxing 
		nums = n;			//  =>reference -> primitive : auto unBoxing
	}	
}
