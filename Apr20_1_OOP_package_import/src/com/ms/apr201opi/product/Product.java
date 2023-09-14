package com.ms.apr201opi.product;


public class Product {
	int price;
	String name;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(price);
		System.out.println(name);
	}
	

}
