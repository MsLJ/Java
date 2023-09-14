package com.ms.apr244ucio.student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String name;
	private Date birth;
	private int guka;
	private int english;
	private int math;
	
	private static SimpleDateFormat sdf
	=new SimpleDateFormat("yyyyMMdd");
	
	
	
		
		
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String l) {
		try {
			String[]l2 = l.split(",");
			name = l2[0];
		    birth = sdf.parse(l2[1]);
			guka = Integer.parseInt(l2[2]);
			english = Integer.parseInt(l2[3]);
			math = Integer.parseInt(l2[4]);

		} catch (Exception e) {
			// TODO: handle exception
		}

		// ...
	}

	public void printInfo() {
		System.out.printf("이름:%s\n",name);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd(E)");
		
		System.out.printf("생일:%s\n",sdf2.format(birth));
		System.out.printf("영어:%d\n",english);
		System.out.printf("국어:%d\n",guka);
		System.out.printf("수학:%d\n",math);
		double avg=(guka+english+math)/3.0;
		System.out.printf("평균:%.1f\n",avg);
		System.out.println("---------");
		
	}

}
