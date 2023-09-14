package com.ms.apr206op.main;

import com.ms.apr206op.hero.Hero;
import com.ms.apr206op.hero.Hulk;
import com.ms.apr206op.hero.Ironman;
import com.ms.apr206op.human.Human;

//변수:데이터 담는 그릇
//자료형:그릇 종류
//자료형이 안맞으면

//polymorphism(다형성)
//		그 언어가 dynamic loading을 해야
//		변수를 만들때는 상위타입
//		실제로 객체를 만들어 넣을때는 하위타입
//		=>실제 정체는 하위타입

//		static loading:변수 자료형따라서 최종 정체가 정해지는
// 		dynamic loading:실제로 만들어넣은 객체 따라서 최종 정체가
public class OMain {
	public static void main(String[] args) {
		//he의 정체는?

		// Ironman i2 =new Hulk(); x
		//	Hero he=new Ironman();//o
		//Ironman i3=new Hero();//x

		Hero he=new Ironman();
		he.printInfo();
		
		Ironman i = new Ironman("토니", 40, "자비스");
		Hulk h = new Hulk("배너", 39, 23);
		//들을 관리
		Hero[]hh= {i,h};
		for (Hero hhhh : hh) {
			hhhh.printInfo();
			
			
		}
		
		System.out.println("-------");
		Human human=new Human();
		human.helpMe(he);
	

	}

}
