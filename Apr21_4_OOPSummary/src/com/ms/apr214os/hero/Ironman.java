package com.ms.apr214os.hero;

public class Ironman implements Hero{
	private String name;
	public Ironman() {
		// TODO Auto-generated constructor stub
	}
	

	public Ironman(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	


	@Override
	public void attack() {
		System.out.println("발차기");
	}
	

}
