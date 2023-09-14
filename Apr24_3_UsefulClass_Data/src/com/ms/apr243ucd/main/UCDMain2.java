package com.ms.apr243ucd.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UCDMain2 {
	public static void main(String[] args) {
		//무슨 요일에 태어났나
		Date now=new Date();
		try {
			String birth="2001-01-08";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat sdf2=new SimpleDateFormat("E");
			Date d=sdf.parse(birth);
			String yoil=sdf2.format(d);
			System.out.println(yoil);
			
				
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("------");
		//몇 살(한국나이)
		
			String birthday2="2001-01-08";
			SimpleDateFormat sdf3=new SimpleDateFormat("yyyy");
			String y=birthday2.substring(0,4);
			System.out.println(y);
			int birthyear=Integer.parseInt(y);
			Date nowDate=new Date();
			SimpleDateFormat sdf4=new SimpleDateFormat("yyyy");
			String cy=sdf3.format(nowDate);
			int curyear=Integer.parseInt(cy);
			
			int age=curyear-birthyear+1;
			System.out.println(age);
		
		
		
		
	}
}
