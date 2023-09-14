package com.ms.may085daodtop.main;

import java.util.Scanner;

public class Consoleview {
	private Scanner inputSystem;

	public Consoleview() {
		inputSystem = new Scanner(System.in);

	}

	public Gift getInput() {
		System.out.println("이름:");
		String n= inputSystem.next();
		System.out.print("가격:");
		int p=inputSystem.nextInt();
		return new Gift(n,p);
		
	}

	public void print(String result) {
		System.out.printf(result);
	}

	public void destroy() {
		inputSystem.close();
	}

}
