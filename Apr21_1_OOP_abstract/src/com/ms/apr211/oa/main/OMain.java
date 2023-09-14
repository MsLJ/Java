package com.ms.apr211.oa.main;



import com.ms.apr211.oa.avangers.Avangers;
import com.ms.apr211.oa.avangers.Hulk;
import com.ms.apr211.oa.avangers.Ironman;

//어벤져스 게임->뽑기->캐릭터가 나오
public class OMain {
	public static void main(String[] args) {
		//Java는 객체를 만들면서 클래스 만드는게 가능
		//클래스명이 없는Avengers의 하위클래스
		//anonymous inner class
		Avangers a=new Avangers() {
			
			@Override
			public void attack() {
				System.out.println("거미줄 발사");
			}
		};
		
		
		
		System.out.println("---------");
		Ironman i=new Ironman("토니", 40, "자비스");
		i.printInfo();
		i.attack();
		i.sleep();
		//singleton,static x
		//토니 40 ai 자비스 아이언맨
		//출력
		//공격하기:빔 발사
		System.out.println("-----------");
		Hulk h=new Hulk("배너", 30, 99);
		h.printInfo();
		h.attack();

	}

}
