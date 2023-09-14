package com.ms.may084mvcp.main;

public class HomeController {
	public static void main(String[] args) {
		ConsoleScreen cs=new ConsoleScreen();
		int x=cs.getx();
		int y=cs.gety();
		CalcResult cr=Calculator.calculate(x, y);
		cs.print(cr);
		//...
		cs.destroy();
	}

}
