package com.ms.test;

import java.util.Iterator;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(16) + 1;
		if (x == 1) {
			System.out.println("루엘 드 샹들리");

		} else if (x == 2) {
			System.out.println("남포 면옥");

		} else if (x == 3) {
			System.out.println("닭 칼국수");

		}

	}

}
