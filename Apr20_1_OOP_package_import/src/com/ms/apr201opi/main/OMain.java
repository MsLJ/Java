package com.ms.apr201opi.main;
import com.ms.apr201opi.product.Moniter;
import com.ms.apr201opi.product.Scanner;
import com.ms.apr201opi.product.Shoes;

//class명 중복되면...->중복 안되게 잘 짓자->불가능
//	-Java에 내장된 class명 어떻게 다 알고..
//	-전세계의 개발자들이 자기가 작업한거 공유하는 문하가 있는데
//	그건 또 어떻게 다 알고
//	->class명 중복 안되게 짓는건 불가능
public class OMain {
	public static void main(String[] args) {
		Shoes s = new Shoes(50000, "에어맥스123", 260);
		s.printInfo();

		System.out.println("--------");
		Moniter m = new Moniter(200000, "ABAV4413", 17);
		m.printInfo();
		System.out.println("--------");
		Scanner sc = new Scanner(500000, "캐논123", true);
		sc.printInfo();
		System.out.println("--------");

	}

}
