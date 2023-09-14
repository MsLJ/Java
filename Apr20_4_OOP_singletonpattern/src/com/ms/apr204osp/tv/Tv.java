package com.ms.apr204osp.tv;

//멤버변수
// 없다->객체는 필요없음: static메소드 기반
// 있다->객체가 필요하긴 한가
//	only one :singleton패턴
//	여러개:평소대로

public class Tv {
	private String name;
	private String maker;

	private static final Tv TNM = new Tv("Space xtv", "Tsla");

	private Tv() {
		// TODO Auto-generated constructor stub
	}

	private Tv(String name, String maker) {
		super();
		this.name = name;
		this.maker = maker;

	}
				//getInstance쓰기도함
	public static Tv getTnm() {
		return TNM;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}


	public void printInfo() {
		System.out.println(name);
		System.out.println(maker);
	}

}
