package com.ms.apr206op.hero;

public class Hulk extends Hero{
	private double jeansize;
	public Hulk() {
		// TODO Auto-generated constructor stub
	}

	public Hulk(double jeansize) {
		super();
		this.jeansize = jeansize;
	}
	

	
	public Hulk(String name, int age, double jeansize) {
		super(name, age);
		this.jeansize = jeansize;
	}

	
	public double getJeansize() {
		return jeansize;
	}

	public void setJeansize(double jeansize) {
		this.jeansize = jeansize;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(jeansize);
	}
	
	

}
