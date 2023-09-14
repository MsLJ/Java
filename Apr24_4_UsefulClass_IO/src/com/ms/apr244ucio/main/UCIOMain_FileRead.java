package com.ms.apr244ucio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UCIOMain_FileRead {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			//생성자에 인코딩방식 쓰게 해놨으면->자바가 가만히 있겠나
//			InputStreamReader개조형(2바이트):이미꽤놓음
//			FileReader fr=new FileReader("C:\\lee\\work space\\Java  수업\\apr24.txt")
			
			//InputStreamReader개조형(8bytes)
			FileInputStream fis=new FileInputStream("C:\\lee\\work space\\Java  수업\\apr24.txt");
			InputStreamReader isr=new InputStreamReader(fis,"utf-8");
			br=new BufferedReader(isr);
			
			String line;
			while ((line=br.readLine())!=null) {
				System.out.println(line);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
