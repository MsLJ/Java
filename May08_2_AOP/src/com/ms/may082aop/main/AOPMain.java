package com.ms.may082aop.main;

import com.ms.may082aop.human.Human;

//PP:절차지향 프로그래밍
//	조건문,반복문 최적으로..
//-------------------------
//OOP:객체지향프로그래밍
//	객체를 잘 써서 실생활을 묘사해서
//	유지보수 좋게
//------------------------
//AOP(Aspect Oriented P):관점지향프로그래밍
//		객체지향프로그래밍을 다른 관점에서 봐서
//		공통된거 좀 정리하자
public class AOPMain {
	public static void main(String[] args) {
		
		Human h=new Human();
		h.goMart();
		h.goPark();
		h.goSchool();
		//사람
		//학교가기
		//마트가기
		//공원가기
	}
}


