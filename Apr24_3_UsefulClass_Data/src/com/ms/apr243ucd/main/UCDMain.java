package com.ms.apr243ucd.main;
//숫자(x,y,z,..:):
//-----------
//합계

import java.util.Scanner;

public class UCDMain {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.print(" ");
		String kk=k.next();
		String[] kkk=kk.split(",");
		
		//try:main작업할 사수
		//throws:정식 클래스 작업할 신입
		int x=0;
		
		for (int i = 0; i < kkk.length; i++) {
			try {
				x+=Integer.parseInt(kkk[i]);//String을->int로 바꿔서 합
				
			} catch (Exception e) {
				System.out.println(kkk[i]);
				//위에 값이 숫자일때 들어가는거여서 문자는 아래로 그대로String
				
			}
			
			
		}System.out.println(x);
		
		
		
		
		
		
		
	}

}
