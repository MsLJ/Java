package com.ms.apr282ucss.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//폰끼리 전화하려면
//전화번호가 필요
//통화서비스만 가능

//컴끼리 통신하려면
//IP주소가 필요(전화번호)
//port 번호도 필요(어떤 서비스를 이용할지 지정)

//웹:80
//FTP:21
//SSH:
//195.168.9.63

//195.168.9.93
public class UCSSMain {
	public static void main(String[] args) {

		ServerSocket ss = null;
		Scanner k = new Scanner(System.in);
		try {
			ss = new ServerSocket(0100);// 0100포트로 서버서비스 시작

			System.out.println("서버시작");
			System.out.println("접속 기다리는중");

			Socket s = ss.accept();// 기다리고있다가 접속자를 연결시켜주는
			System.out.println("서:누가 접속함");

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

			// 동시에 여러 작업

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
				bw.write("" + msg + "\r\n");
				jta.append("" + msg + "\r\n");
				bw.flush();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		k.close();

		try {
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
