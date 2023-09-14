package com.ms.apr203oe.menu;

public class Menu {
	//1.멤버변수
	private String name;
	private int price;
	private boolean soldout;
	//2.생성자 시리즈
	//2-1 기본생성자
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	//2-2 오버로딩 생성자
	public Menu(String name, int price, boolean soldout) {
		super();
		this.name = name;
		this.price = price;
		this.soldout = soldout;
	}
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	//3 getter ,setter(ctrl+shift+s)
	//	외부에서 접근할 필요가 있는것만
	//	정보은닉
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isSoldout() {
		return soldout;
	}
	public void setSoldout(boolean soldout) {
		this.soldout = soldout;
	}
	//4.기타 메소드
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(soldout);
	}
	
	
	
	
	
	
	



}
