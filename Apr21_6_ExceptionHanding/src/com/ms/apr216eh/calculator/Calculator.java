package com.ms.apr216eh.calculator;

//정상 :6- 7- 12- 13- 8
//y에 0: 6- 7(AE)-9 - 10- 12- 13- 11
public class Calculator {
	public static int divide(int x, int y) {
		try {
			int c = x / y;
			return c;
		} catch (Exception e) {
			System.out.println("나누기 0?");
			return 0;
		} finally {
			System.out.println("ㅋ");
		}

	}

}
