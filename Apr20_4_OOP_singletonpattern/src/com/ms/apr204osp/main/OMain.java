package com.ms.apr204osp.main;

import com.ms.apr204osp.me.Me;
import com.ms.apr204osp.tv.Tv;

public class OMain {
	public static void main(String[] args) {
		Me m = Me.getM();
		m.printInfo();

		Me m2 = Me.getM();
		m2.printInfo();

		System.out.println(m);
		System.out.println(m2);

		System.out.println("------");

		Tv tnm = Tv.getTnm();
		tnm.printInfo();
		// 강의실에 있는 tv

	}

}
