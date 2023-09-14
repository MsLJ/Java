package com.ms.apr211.oa.avangers;

public class Hulk extends Avangers{

	private int jeansize;
	public Hulk() {
		// TODO Auto-generated constructor stub
	}

	public Hulk(String name, int age,int jeansize) {
		super(name, age);
		this.jeansize = jeansize;
	}
	

	public int getJeansize() {
		return jeansize;
	}

	public void setJeansize(int jeansize) {
		this.jeansize = jeansize;
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(jeansize);
	}
	@Override
	public void attack() {
		System.out.println("주먹");
		
	}
}
