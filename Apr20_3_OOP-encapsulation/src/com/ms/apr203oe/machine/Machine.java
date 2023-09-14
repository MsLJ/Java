package com.ms.apr203oe.machine;

public class Machine {
	private String name;
	private int price;
	private boolean ice;
	public Machine() {
		// TODO Auto-generated constructor stub
	}
	public Machine(String name, int price, boolean ice) {
		super();
		this.name = name;
		this.price = price;
		this.ice = ice;
	}
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
	public boolean isIce() {
		return ice;
	}
	public void setIce(boolean ice) {
		this.ice = ice;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(ice);
	}

}
