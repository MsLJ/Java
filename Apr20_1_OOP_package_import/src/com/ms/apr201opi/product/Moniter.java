package com.ms.apr201opi.product;

public class Moniter extends Product{
	int inch;
	public Moniter() {
		// TODO Auto-generated constructor stub
	}
	public Moniter(int price, String name, int inch) {
		super(price, name);
		this.inch = inch;
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(inch);
	}
	

}
