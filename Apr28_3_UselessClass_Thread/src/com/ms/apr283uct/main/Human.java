package com.ms.apr283uct.main;

//여러 Thread가 자원을 공유하게되면...문제 발생
//critical section(임계영역) 설정

//synchronized 메소드 (자바내에서의 해결책)
//	한synchronized 메소드 끝날동안
//	다른synchronized 메소드는 대기
//	=>한 순간에는 하나의 synchronized메소드만 실행

//웹 개발에서는 멀티쓰레드가 기본
//JSP.jar/Spring은 기본적으로 알아서 처리해줌
//개념이해는 필요
public class Human {
	private String brain;

	private synchronized void sayName() {
		for (int i = 0; i < 10; i++) {
			try {
				brain = "ㅇㅈㅎ";
				Thread.sleep(100);
				System.out.printf("이름은%s\n", brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private synchronized void sayHobby() {
		for (int i = 0; i < 10; i++) {
			try {
				brain = "누워있기";
				Thread.sleep(5000);
				System.out.printf("취미는%s일껄?\n", brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void introduce() {
		new Thread() {
			@Override
			public void run() {
				sayName();
				sayHobby();
			}

		}.start();// docs설명에 시계모양있는 메소드는 synchronized메소드
	}

}
