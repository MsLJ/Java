package com.ms.apr203oe.menu;

public class Drink extends Menu {
	private double alchol;

	public Drink() {
		//private걸린거는 상속 안된다?-x
		//어쨋든 Drink은 Menu의 외부
		//접근제어자 판정기준:Menu
		//System.out.println(name);
		System.out.println(getName());
		//price=400;
		setPrice(5000);
	}

	public Drink(String name, int price, boolean soldout, double alchol) {
		super(name, price, soldout);
		this.alchol = alchol;
	}

	public Drink(String name, int price, double alchol) {
		super(name, price);
		this.alchol = alchol;
	}

	public Drink(double alchol) {
		super();
		this.alchol = alchol;
	}

	public double getAlchol() {
		return alchol;
	}

	public void setAlchol(double alchol) {
		this.alchol = alchol;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(alchol);
	}

}
