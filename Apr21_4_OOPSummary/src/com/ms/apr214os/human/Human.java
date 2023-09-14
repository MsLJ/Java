package com.ms.apr214os.human;

import com.ms.apr214os.hero.Hero;

public class Human {
	private String name;
	private Hero hero;
	public Human() {
		// TODO Auto-generated constructor stub
	}
	public Human(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printInfo() {
		System.out.println(name);
	}
	public void setHero(Hero h) {
		hero=h;
		
	}
	public void callhero() {
		System.out.println("help");
		hero.attack();
	}

}
