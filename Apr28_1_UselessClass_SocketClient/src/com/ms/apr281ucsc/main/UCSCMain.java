package com.ms.apr281ucsc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//195.168.9.93
public class UCSCMain {
	public static void main(String[] args) {
		Socket s = null;
		Scanner k = new Scanner(System.in);
		try {
			s = new Socket("195.168.9.93", 8080);
//			s = new Socket("195.168.9.63", 0100);
			System.out.println("클:접속성공");
			InputStream is = s.getInputStream();// 메세지를 받을준비
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			OutputStream os = s.getOutputStream();// 적은 메세지를 보낼준비
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			JFrame jf = new JFrame();
			JTextArea jta = new JTextArea();
			jf.add(jta);
			jf.setSize(300, 500);
			jf.setVisible(true);

			new Thread() {
				public void run() {
					while (true) {
						try {
							jta.append(br.readLine() + "\r\n");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				};
			}.start();

			while (true) {
				System.out.println("뭐:");
				String msg = k.next();
				jta.append("" + msg + "\r\n");
				bw.write("" + msg + "\r\n");

				bw.flush();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		k.close();

		try {
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
