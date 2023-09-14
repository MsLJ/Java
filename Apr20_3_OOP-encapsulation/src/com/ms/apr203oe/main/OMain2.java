package com.ms.apr203oe.main;

import com.ms.apr203oe.machine.Machine;
import com.ms.apr203oe.menu.Drink;
import com.ms.apr203oe.menu.Menu;

public class OMain2 {
	public static void main(String[] args) {
		Menu m = new Menu("제육", 123465555, false);
		m.setPrice(7000);
		// m.price=500;
		m.setName("김치볶음밥");
		// System.out.println(m.name);
		System.out.println(m.getName());

		System.out.println(m.isSoldout());
		m.printInfo();
		System.out.println("-------------");
		Machine mc = new Machine("위니아123", 500000, true);
		mc.printInfo();
		// 위니아123 ,50만원,얼음나오는 정수기
		// 출력
		System.out.println("-----");
		Drink dr = new Drink("처음처럼", 4000, 12);
		dr.printInfo();

	}

}
