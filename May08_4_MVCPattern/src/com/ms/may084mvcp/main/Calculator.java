package com.ms.may084mvcp.main;

public class Calculator {
	public static CalcResult calculate(int x,int y) {
		int p=x+y;
		int m=x-y;
		int r=x*y;
		int i=x/y;
		return new CalcResult(p,m,r,i);
		
	}
		
	
}
