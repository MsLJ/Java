package com.ms.apr283uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//multiThread이용방법
//1)extends Thread
//
public class ForThread extends Thread {
	@Override
	public void run() {
		JFrame jf=new JFrame();
		JTextArea jta=new JTextArea();
		jf.add(jta);
		jf.setSize(300,500);
		jf.setVisible(true);
		
		for (int i= 0; i < 5; i++) {
			
			jta.append("x\r\n");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	
	
	}

}
