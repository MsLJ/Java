package com.ms.apr282uct.main;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class UCRMain {
	public static void main(String[] args) {
		try {
			Robot r=new Robot();//키보드,마우스 움직임
//			r.mouseMove(1150, 200);
//			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
			r.mouseMove(700, 0);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_B);
			r.keyRelease(KeyEvent.VK_B);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);
			Thread.sleep(500);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
	}
}
	
