
package com.iu.j2.string.ex.money;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.j2.string.ex.member.Member;

public class MoneyService {
	private StringBuffer sb;		//private범위의 StringBuffer타입인 변수 sb를 선언만함.

	public MoneyService() {		
		sb = new StringBuffer(); //생성자생성시 객체생성 동시에
		sb.append("한국, 1000, 1000.0, 1000.0,");		//객체안에 내용
		sb.append("미국, 1, 1150.22, 1200.32,");
		sb.append("영국, 10, 1350.13, 1550.32,");
		sb.append("프랑스, 100, 1250.58, 1360.22");
		//sb 문자열 잘라서 배열만들기, money객체에 넣고 객체 리턴
		//문자열 숫자로 바꾸기
		//init() 메서드안	
	}
	
	//moneyDelete 
	//만들어진 리스트를 가지고 와서
	//나라명 입력, 해당 나라를 리스트에서 삭제 
	//인덱스번호를 삭제하고 돌아왔을때 삭제된 건 빠지고 남은 것들만 출력
	public void moneyDelete(ArrayList<Money> ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 나라명 입력");
		String nation = sc.next();
		//한국 ->한국이 있는 object 찾기 -how? 
		int index=0;
		for(int i=0; i<ar.size(); i++) {
			Money name = ar.get(index);
			
			if(nation.equals(name.getNation())) {
				ar.remove(index);
			}
			index++;
		}
	}
	
	//moneySearch
	//만들어진 리스트를 가지고와서 
	//나라명을 입력받아서 해당 나라명이 있는 리스트를 찾아서 해당  객체를 리턴해서 메인에서 출력
	public Money moneySearch(ArrayList<Money> ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 나라명 입력");
		String nation = sc.next();
		//nation ==한국 /미국/ 영국/ 프랑스
		
		Money money=null;
		for(int i=0;i<ar.size();i++) {
			if(nation.equals(ar.get(i).getNation())) {
				money = ar.get(i);
				break;
			}
		}
		
		return money;
		
		/** 내가한거
		 * int index=0;
		boolean check = false;
		for(int i=0; i<ar.size(); i++) {
			Money name = ar.get(index);
			
			if(nation.equals(name.getNation())) {
				System.out.println(name.getNation());
				System.out.println(name.getDon());
				System.out.println(name.getSell());
				System.out.println(name.getBuy());
				check = true;
			}
			index++;
		}
		if(check==false) {
			System.out.println("없는 나라입니다");
		}
		*/
	
	}
	
	
	
	//moneyAdd
	//만들어진 리스트에 새로운 money 객체 추가
	//스캐너로 입력
	public void moneyAdd(ArrayList<Money> ar) {	//main에서 data 받아옴
		Scanner sc = new Scanner(System.in);	
		Money  money = new Money();				//새로운 객체 생성
		System.out.println(" 국가 명 입력");
		money.setNation(sc.next());				//입력받은 정보를 객체의.nation에 저장
		System.out.println(" 돈 입력");
		money.setDon(sc.nextInt());				//입력받은 정보를 객체의.don에 저장
		System.out.println("팔 때 환율");
		money.setSell(sc.nextDouble());			//입력받은 정보를 객체의.sell에 저장
		System.out.println("살 때 환율");
		money.setBuy(sc.nextDouble());			//입력받은 정보를 객체의.buy 에 저장
		
		ar.add(money);							//main에서 받은 리스트안에 money객체를 추가!
	}
	
	public ArrayList<Money> init() {							//멤버 메서드 생성
			String st = String.valueOf(sb);			//위에 sb가 StringBuffer타입이므로 String타입으로 변환시켜줌.
			//String st = sb.toString();			//string 타입으로 변환하는 2가지 방법: valueOf() or toString()
			
			StringTokenizer str = new StringTokenizer(st, ",");		//StringTokenizer타입의 객체 생성 =내용은 string으로 바꾼 sb를 ,로 자른 각자의 token!
			
			//System.out.println(str);								->여기서 str을 프린트하면 객체의 주소가 나옴
			//System.out.println(str.countTokens());				->,로 몇번 자를건지 나타냄. 여기선 총 16번
			//Money[] ar = new Money[4];								//자른값을 모은 배열을 만들기 위해 새로운 array 생성
			ArrayList<Money> ar = new ArrayList<>();				//배열대신 ArrayList 쓰기 
			int index = 0;											//생성한 array의 index에 접근하기 위해 변수선언
			while(str.hasMoreTokens()) {							//각 token을 체크해서 다음 token이 있는지 없는 지 확인 후 true/false를 리턴하는 메서드=hasMoreTokens()
				Money money = new Money();							//새로운 객체생성 for 나라당 필요한 정보만 넣기위해	
				money.setNation(str.nextToken());					//객체.token입력 nation은 원래 string 타입이라 바로 넣으면됨.
				String trim = str.nextToken().trim();				//다음 token은 " 1000"이라서 space를 삭제하기 위해 trim() 을 사용 
				//Integer don = Integer.parseInt(trim);
				money.setDon(Integer.parseInt(trim));				//객체.다음token(string을 Integer로 변환하여) 삽입.
				trim = str.nextToken().trim();						
				//Double sell = Double.parseDouble(trim);			//객체.다음token(string을 Double로 변환하여) 삽입.
				money.setSell(Double.parseDouble(trim));
				trim = str.nextToken().trim();
				//Double buy = Double.parseDouble(trim);			//객체.다음token(string을 Double로 변환하여) 삽입.
				money.setBuy(Double.parseDouble(trim));
				
			//	ar[index] = money;									//위에서 만든 array에 각 객체(안에는 setNation,setDon,setSell,setBuy값을 포함)를 한칸에 집어넣는것.
			//	index++;											//칸 이동을 위해 index를 증감시켜줘야함.
				ar.add(money);
			}
			
			return ar;												//array 자체를 return.
			
		}
		
	
}
