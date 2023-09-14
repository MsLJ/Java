package com.ms.apr214os.main;

import java.nio.file.spi.FileSystemProvider;

import com.ms.apr214os.hero.Ironman;
import com.ms.apr214os.human.Human;
import com.ms.apr214os.planet.Planet;

//part1:PP
//part2:OOP
//part3:유용한 내장 클래스 소개

//이력서:보유기술
//		Java:언어
//		JSP(Java+HTML+CSS)
//		Spring(JSP를 유지보수하기 좋게)
public class OMain {
	public static void main(String[] args) {
		Planet p=new Planet("Earth");
		p.setSize(100);
		p.setLook(true);
		
		System.out.println("-----------------");
		Planet p2=new Planet("goldsung");
		p2.setSize(50);
		p2.setLook(true);
		
		System.out.println("------------");
		Human h=new Human("홍길동");
		Human h2=new Human("금길동");
		p.add(h);
		p2.add(h2);
		System.out.println("--------");
		Ironman i=new Ironman();
		i.setName("스타크");
		i.attack();
		System.out.println("--------");
		h.setHero(i);
		h.callhero();
		
		
		//이름인 지구 별 크기 100  planet
		//그 별 보인다 
		//금성 크기 50
		//저 별에 저 사람을 등록을 시키죠
		//이름이 홍길동인사람
		
		//영웅들은 공격하기를 반드시 할줄알아야[사수]
		//반드시 추상메소드->->추클/인중에 골라야
		//추클은 상속라인을 막으니->Hero인터페이스 만들자
		//영웅이 아이언맨
		
		//저 사람이 자기 전담영웅으로 아이언맨을 찜
		
		

	}

}
