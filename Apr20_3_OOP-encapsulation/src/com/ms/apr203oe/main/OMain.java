package com.ms.apr203oe.main;

import java.util.Scanner;

import com.ms.apr203oe.human.Human;

public class OMain {
	public static void main(String[] args) {
		Human h= new Human("홍길동", 30);
		h.printInfo();
		System.out.println("--------");
		
		Scanner k= new Scanner(System.in);
		System.out.print("수정할 나이:");
		int a=k.nextInt();
		h.setAge(a);
		//사람 나이 좀 수정
		System.out.println(h.getAge());;
		
		//홍길동 30살 사람
		//출력
	}

}
