package com.ms.apr243ucd.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 버전
//  v1.10.1->v1.10.2
//		minor version
//	뒷자리가 바뀔수록 살짝 바뀐거
//	major version

//Date:	Java초창기에 만들어진
//			세월이 가고, 기술도 발전
//			어떤 기능이 더이상 못쓰게 됨
//			->없애고 새 기능을 만들든지,업그레이드 시키든지

//deprecated(구식):현재 버전에서는 괜찮은데
//				다음버전에 없어져도 토 달지마라
//				유예기간 
//한글,날짜
public class UCDMain_Date {
	public static void main(String[] args) {
		Date now = new Date();//현재시간날짜
		System.out.println(now);
		//Date->String
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		String y=sdf.format(now);
		System.out.println(y);
		
		
		//String->Date
		try {
			String s="2023-03/01";//특정시간날짜
			SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM/dd");
			Date d=sdf2.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//뭐가 위험하나
		
//		System.out.println(now.getYear());
//		System.out.println(now.getMonth());
//		System.out.println(now.getDate());
//		System.out.println(now.getHours());
	}

}
