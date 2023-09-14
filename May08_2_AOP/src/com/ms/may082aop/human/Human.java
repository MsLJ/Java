package com.ms.may082aop.human;

public class Human {
	private void ready() {
		System.out.println("take a shower");
		System.out.println("wearing");
	}
	public void goSchool() {
		ready();
		System.out.println("walking");
		System.out.println("Hi teacher");
		System.out.println("------------");
	}
	public void goPark() {
		ready();
		System.out.println("drive");
		System.out.println("drive");
		System.out.println("drive");
		System.out.println("drive");
		System.out.println("------------");
	}

	public void goMart() {
		ready();
		System.out.println("drive");
		System.out.println("parking");
		System.out.println("shopping");
		System.out.println("------------");
		
	}
}
