package com.ms.apr205ofp.main;

import com.ms.apr205ofp.soldesk.Ahn;
import com.ms.apr205ofp.soldesk.Student;
//멤버변수
//없다->객체는 필요없음: static메소드 기반
//있다->객체가 필요하긴 한가
//	only one :singleton패턴
//	여러개:
//		대량으로 자동화
public class OMain {

	public static void main(String[] args) {
		//학생 1,홍길동,20살 학생
		//출력
		//2,김길동 25살
//		3 최길동 30살
		Ahn a=new Ahn();
		Student s1=a.talk("홍", 20);
		s1.printInfo();
		System.out.println("--------");
		Student s2=a.talk("김",40);
		s2.printInfo();

	}

}
