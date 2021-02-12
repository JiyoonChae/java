package com.iu.j3;

public class ReturnTest1 {               //ReturnTest1이라는 클래스 안에
	public void t1() {					// t1() 이라는 멤버method 생성 
		System.out.println("void는 리턴이 없어요"); // 내용은 그냥 프린트문
	}
	
	public int t2() {						//ReturnTest1이라는 클래스 안에 t2()라는 method생성
		System.out.println("자기 나이를 리턴");  // 나이인 int타입의 정수를 return 하기위해 리턴타입을 void가아닌 int로 써줌.
		return 30;							//return할 값.
	}
	
	public ReturnModel t3() {				//ReturnTest1이라는 클래스 안에 t3()라는 method생성, 데이터타입 =ReturnModel ->컴터가 ReturnModel이라는 클래스를 찾을거임.
		//int age = 30;						//내용이 다른 타입의 값임. 정수 int와 문자열 string.
	    //String name = "zac";				//두가지를 다 쓰기위해서 ReturnModel이라는 새로운 class를 만들어 멤버변수로 다른 데이터 타입들을 저장.
		ReturnModel returnModel = new ReturnModel(); //그 멤버변수에 접근하기 위해서 객체 생성을 해줘야함. 멤버변수가 담긴 class타입 새변수이름 = new 타입();
		returnModel.age=30;					//참조변수이름.찾고자하는 변수이름?
		returnModel.name ="zac";			//참조변수이름.찾고자하는 변수이름?
		
		return returnModel; 				//return에서 리턴해줘야할 것은 참조변수(=객체?)그 자체인건가? 리턴을 위해서는 위에 리턴타입도 참조변수의 타입과 일치시켜줘야함.
	}
	
	public ReturnModel [] t4() {  			//ReturnTest1이라는 클래스 안에 ReturnModel[] 배열타입의 t4(); method생성.
		int age = 20;						//근데, ReturnModel이라는 클래스에는 단순히 int age, String name; 변수 선언만 되어있음.
		String name = "abc";				//여기서(=멤버메서드 내용안에서) 원하는 값을 설정해줌. 
		int age2= 30;						//문제는 두번 이상 다른 값을 넣고 싶은것. 변수이름을 바꿔서 다른 값을 지정해줌.
		String name2 = "efg";
		
				ReturnModel reMo = new ReturnModel();	//객체선언. 
				reMo.age = age;							//이 객체안에 들어갈 값은 ReturnModel이란 타입때문에 이 클래스를 찾아가서 그안의 멤버변수를 사용할 수 있음?!!
				reMo.name = name;						//reMo라는 참조변수는 지금 int=0;과 String=null;을 가지고 있어서 새로운 값을 assign해줄수있음. 바로 값을 할당가능
				
				ReturnModel reMo2 = new ReturnModel(); //객체 여러번 선언 가능
				reMo2.age = age2;						//다른값 할당
				reMo2.name = name2;
				
				ReturnModel [] ar = new ReturnModel[2];  //이건모냐?? ReturnModel클래스였는데 이제 배열 타입을 선언함. 배열 ar은 2칸이다~
				ar[0]=reMo;		//배열의 첫번째 자리에 reMo 객체를 넣겠다
				ar[1]=reMo2; 	//배열의 두번째 자리에 reMo2 객체 자체를 넣겠다
				return ar;      //return은 새로만든 이 배열 자체를 return하겠다??? return이 뭔데 그 값을 돌려주다,반납하다 = 위에 내용대로 다~처리한 후 마지막 값을 돌려준다?!
	}
}
