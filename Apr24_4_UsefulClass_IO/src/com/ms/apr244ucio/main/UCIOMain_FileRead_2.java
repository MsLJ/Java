package com.ms.apr244ucio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class UCIOMain_FileRead_2 {
	public static void main(String[] args) {
		BufferedReader bf=new BufferedReader(null);
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\lee\\work space\\Java  수업\\student.csv");
			InputStreamReader isr;
			try {
				isr = new InputStreamReader(fis,"utf-8");
				bf=new BufferedReader(isr);
				String line;
				while ((line=bf.readLine())!=null) {
					System.out.println(line);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
