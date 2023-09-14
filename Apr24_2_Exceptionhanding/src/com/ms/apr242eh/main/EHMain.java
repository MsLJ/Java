package com.ms.apr242eh.main;

import java.util.Scanner;

import com.ms.apr241eh.calculator.Calculator;

//회사에서 새 프로젝트 시작

//main은 개발 팀장
//클래스를 작업하게 될 신입 개발자
//1번 ->직접 처리->책임지나?
//=>대응은 개발팀장이 하는게 맞지
//프로젝트가 달라지면 대응방법도 달라져야할텐데..

//가격:
//수량:
//-----
//개당 가격

//뭐가 위험한가 어떻게 아나
//	Java는 예외처리를 안하면 에러
//	하기 싫어도 해야
public class EHMain {
	public static void main(String[] args) {
		
		
		
		Scanner k=new Scanner(System.in);
		System.out.print("소총가격:");
		int price=k.nextInt();
		
		System.out.print("수량:");
		int quantity=k.nextInt();
		
		System.out.println("-------");
		
		//그때 try -catch- finally로 수정불가
//		System.out.println(Calculator.divide(price, quantity));
		//그때 throws 수정가능
		try {
			System.out.println(Calculator.divide2(price, quantity));
			
		} catch (Exception e) {
			System.out.println("0을 잘못 썼네요");
		}
		
	}

}
