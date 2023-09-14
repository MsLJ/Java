package com.ms.apr205ofp.game;

public class Orc extends Monster{

	
	
	public Orc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orc(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("주먹질");
	}

}
