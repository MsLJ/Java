package com.ms.apr205ofp.game;

public class Troll extends Monster{

	
	public Troll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Troll(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("칼질");
	}

}
