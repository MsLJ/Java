package com.ms.apr211.oa.avangers;

//Avangers:실체가 없는 추상적인 개념

//abstract class: 객체를 못만드는 클래스
//	abstract메소드를 하나라도 갖고있으면

//abstract 메소드:미구현된 메소드
//		하위클래스에서 반드시 오버라이딩해야

public abstract class Avangers {
	private String name;
	private int age;

	public Avangers() {
		// TODO Auto-generated constructor stub
	}

	public Avangers(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);

	}

	// 모든 어벤져스들이 공격하기 기능이
	// 막상 뭐라 써야할지...
	public abstract void attack();
	// abstract 메소드


}
