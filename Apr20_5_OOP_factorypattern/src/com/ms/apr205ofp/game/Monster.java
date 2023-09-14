package com.ms.apr205ofp.game;


public class Monster {
	private int x;
	private int y;
	
	
	Monster() {
		// TODO Auto-generated constructor stub
	}
	
	
	Monster(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	


	int getX() {
		return x;
	}


	 void setX(int x) {
		this.x = x;
	}


	int getY() {
		return y;
	}


	void setY(int y) {
		this.y = y;
	}


	public void attack() {
		System.out.printf("%d,%d에서",x,y);
		
		
	}

}
