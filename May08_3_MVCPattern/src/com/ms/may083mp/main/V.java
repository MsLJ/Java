package com.ms.may083mp.main;

import java.util.Scanner;

//View:사용자한테 보여짐,입력받고 출력받기
public class V {
	public static int getNo() {
		Scanner k=new Scanner(System.in);
		System.out.print("정수:");
		return k.nextInt();
		
		
	}
	public static void print(String s) {
		System.out.println(s);
	}

}
