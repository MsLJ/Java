package com.ms.apr214os.planet;

import com.ms.apr214os.human.Human;

public class Planet {
	private String name;
	private int size;
	private boolean look;
	
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}
	public Planet(String name, int size, boolean look) {
		super();
		this.name = name;
		this.size = size;
		this.look = look;
	}
	
	public Planet(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isLook() {
		return look;
	}
	public void setLook(boolean look) {
		this.look = look;
	}
	public void printname() {
		System.out.println(name);
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(size);
		System.out.println(look);
	}
	public void add(Human h) {
		System.out.print(h.getName());
		System.out.print("이");
		System.out.print("등록된");
		System.out.print(name);
		System.out.print("에 살아요");
		System.out.println("");
		
	}

}
