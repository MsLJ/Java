package com.ms.apr201opi.product;
public class Shoes extends Product{
	int size;
	public Shoes() {
		// TODO Auto-generated constructor stub
	}
	public Shoes(int price, String name, int size) {
		super(price, name);
		this.size = size;
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(size);
	}
	

}
