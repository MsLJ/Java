package com.ms.apr283uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;


//상속가능 왜냐 인터페이스를 갖다쓰는거기에 그러므로 이게 1번보다 더 쓸일이 많다..
//2)implements Runnable
public class ForThread2 implements Runnable {

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

}
