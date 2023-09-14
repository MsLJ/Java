package com.ms.apr202oam.product;

//access modifier(접근제어자,접근지정자......)

//멤버들의 외부에서 접근여부
//	public		:	다
//	protected	:	같은패키지 or다른패키지지만 하위클래스->???
//	private		:	외부에서만 접근 불가
//	(default,friendly):같은패키지


//protected가 사실상 default랑 같게 작동함
public class Product {
	public String name;
	protected int price;
	String maker;
	

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}

}
