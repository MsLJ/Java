package com.ms.apr206op.hero;

public class Ironman extends Hero {
	private String ai_name;

	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	
	
	


	public Ironman(String name, int age, String ai_name) {
		super(name, age);
		this.ai_name = ai_name;
	}






	public String getAi_name() {
		return ai_name;
	}






	public void setAi_name(String ai_name) {
		this.ai_name = ai_name;
	}






	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(ai_name);
	}
}
