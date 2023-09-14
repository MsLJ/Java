package com.ms.may085daodtop.main;

public class HomeController {
	public static void main(String[] args) {
		Consoleview cv = new Consoleview();
		Gift g=cv.getInput();
		String result=GiftDao.reg(g);
		cv.print(result);
		cv.destroy();

	}

}
