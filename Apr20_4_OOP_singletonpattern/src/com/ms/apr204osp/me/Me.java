package com.ms.apr204osp.me;

//객체를하나만 만들어서 쓰게 해야
// =>singleton패턴

//객체들의 공통(공유)속성
//객체는 세상에 하나뿐

//캡슐화
public class Me {

	private String name;
	private int age;
	private double weight;
	private double height;
	//2)내부에서 객체 만들어서 못바꾸게
	private static final Me M=new Me("이준하", 23, 70, 185);

	
	//1)생성자시리즈 private->외부에서 객체 못만들게
	private Me() {
		// TODO Auto-generated constructor stub
	}
	//3)2)에서 만든거 외부에서 사용할 수 있게
	public static Me getM() {
		return M;
	}
	

	private Me(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(height);
	}

}
