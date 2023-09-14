package com.ms.apr211.oa.avangers;

import com.ms.apr211.oa.flyobject.Flyobject;
import com.ms.apr211.oa.human.Human;

//아이언맨 =어벤져스
//아이언맨 =사람
//아이언맨=날아다니는존재

//다중상속:
//		Java를 비롯한 대부분의 언어들은 안됌
//		Python은 됌

//정식으로 다중상속은 안되는데: 클래스 여러개로부터 상속은 못받음
//대신 마이너하게 다중상속 가능: 인터페이스는 여러개 가능

public class Ironman extends Avangers implements Human,Flyobject{
	private String ai;
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, String ai) {
		super(name, age);
		this.ai = ai;
	}

	public String getAi() {
		return ai;
	}

	public void setAi(String ai) {
		this.ai = ai;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(ai);
	}
	@Override
	public void attack() {
		System.out.println("빔");
		
	}
	@Override
	public void sleep() {
		System.out.println("쿨");
	}

	@Override
	public void fly() {
		System.out.println("날기");
		
	}


}
