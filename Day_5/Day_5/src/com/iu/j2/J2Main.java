package com.iu.j2;

import java.util.Scanner;

public class J2Main {

	public static void main(String[] args) {
		Character ch = new Character(); // class를 사용해서 객체 생성?
			ch.name = "Harry Potter"; //ch객체의 멤버변수  name?
			ch.job ="마법사";
			ch.level= 25;
			ch.hp=40;
			ch.mp=100;

		Monster mon = new Monster();
			mon.name = "nuxe";
			mon.exp = 30;
			mon.hp = 100;
			mon.mp = 60;
			
		Weapon wp = new Weapon();
		 	wp.name ="리나도";
		 	wp.type ="sword";
		 	wp.damage = 40;
		 	wp.custom = 1;
		 	
		Weapon wp2 = new Weapon();
			wp2.name = "몽둥이";
			wp2.type = "둔기";
			wp2.damage = 200;
			wp2.custom = 3;
		
			ch.weapon= wp; //캐릭터의 무기가 wp의 특성을 가짐
			mon.weapon = wp2; //몬스터의 무기가 wp2의 특성을 가짐
			
		//캐릭터의 무기의 이름
		//몬스터의 무기의 이름
			System.out.println(ch.weapon.name); //위에 ch.weapon=wp를 해줬기때문에 ch.weapon.name으로 접근할 수있는것.
			System.out.println(mon.weapon.name);
			
			Character ch2 = new Character();
			ch2.name = "jiji";
			ch2.weapon = new Weapon();
			ch2.weapon.name = "test";
			
			Scanner sc = new Scanner(System.in);
			//몬스터 2마리 (2개의 객체) 생성 각각의 이름을 입력받고 출력.
			Monster m1 = null; //지역변수라 못쓰는 한계를 극복하기 위해 밖에 변수선언.
			//같은 데이터 타입을 여러개 묶는 것
			Monster [] ar = new Monster[2];
			for(int i=0; i<ar.length; i++) {
				m1 = new Monster();
				System.out.println("몬스터 이름 입력");
				m1.name = sc.next();
				ar[i]= m1;
				System.out.println(ar[i].name);
			}
			
				
		/*	Monster mon1 = new Monster();
			Monster mon2 = new Monster();
			
			System.out.println("몬스터 이름");
			mon1.name = sc.next();
			System.out.println("몬스터 이름");
			mon2.name = sc.next();
			
			System.out.println(mon1.name);
			System.out.println(mon2.name);
			}*/
			
			System.out.println("프록그램 종료");
					
}
}
