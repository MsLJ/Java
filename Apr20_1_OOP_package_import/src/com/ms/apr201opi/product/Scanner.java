package com.ms.apr201opi.product;
public class Scanner extends Product{
	boolean fax;
	public Scanner() {
		// TODO Auto-generated constructor stub
	}
	public Scanner(int price, String name, boolean fax) {
		super(price, name);
		this.fax = fax;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(fax);
	}
	

}
