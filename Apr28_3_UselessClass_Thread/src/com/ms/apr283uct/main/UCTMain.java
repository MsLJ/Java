package com.ms.apr283uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//한국어로 설계->..
//JVM이 thread를 하나 만들어서 UCTMain.main(...)으로 보냄

//thread:프로그램 흐름
//		위->아래,왼쪽->오른쪽

//multiThread
//		JVM이 만들어준 thread:main thread
// 		개발자가 만들어서 쓰는 thread:sub thread
public class UCTMain {
	public static void main(String[] args) {
		ForThread ft = new ForThread();
		//ft.run();
		ft.start();//새 Thread하나 만들어서 실행
		Thread t=new Thread(new ForThread2());
		t.start();
		
		//3)사실상 1번
		Thread tt=new Thread();{
			@Override
			public void run() {
				JFrame jf = new JFrame();
				JTextArea jta = new JTextArea();
				jf.add(jta);
				jf.setSize(300, 400);
				jf.setLocation(300, 0);
				jf.setVisible(true);

				for (int i = 0; i < 5; i++) {

					jta.append("c\r\n");
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("z");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
