package com.ms.apr213tijb.main;
//사수:딴짓 못하게-> 추상메소드

//		신입에게 interface 만들어주면서 업무지시+
//추상메소드 쓰려면
//abstract class vs interface
//	근데 자바는 다중상속이 
//	추상클래스를 줘버리면 다중상속x->상속라인이 막힘

import com.ms.apr213tijb.hero.Ironman;

//	문제가 생기면 바로
//	문제가 안생기게

public class TIJMain {
	public static void main(String[] args) {
		Ironman i = new Ironman();
		i.attack();

	}
}
