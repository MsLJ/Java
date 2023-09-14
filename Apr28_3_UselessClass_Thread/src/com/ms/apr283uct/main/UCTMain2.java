package com.ms.apr283uct.main;

//mainTHread:0.5초마다 z찍기 x5

//subThread 0.5초마다 찍기 무한
//이 프로그램의 메인기능이 0.5초마다 찍기
//다 찍고나면 프로그램 끝나는데 =>subThread는????
//=>mainThread끝난다고 subThread도 끝나는건 아님

public class UCTMain2 {
	public static void main(String[] args) {

		new Thread() {
			public void run() {
				while (true) {
					System.out.println("z");
					try {
						Thread.sleep(400);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}

		}.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("d\r\n");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	
}
