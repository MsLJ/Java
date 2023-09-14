package com.ms.may084mvcp.main;

import java.util.Scanner;

public class ConsoleScreen {
	
	private Scanner inputSystem;
	public ConsoleScreen() {
		inputSystem=new Scanner(System.in);
	}
	
	
	public int getx() {
		System.out.print("x:");
		
		return inputSystem.nextInt();
		
	
	}
	public int gety() {
		System.out.print("y:");
		return inputSystem.nextInt();
		
	}
	public void print(CalcResult cr) {
		System.out.println(cr.getHab());
		System.out.println(cr.getCha());
		System.out.println(cr.getGob());
		System.out.println(cr.getMoks());
		
		
		
	}
	public void destroy(){
		inputSystem.close();
		
	}

}
