package com.ms.apr244ucio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ms.apr244ucio.student.Student;

//1)그 csv읽어서 콘솔출력
//2)뜯고
//3)학생객체
//4)
//		이름:홍길동
//		생일:1999-03-01(수)
//		국어:100
//		영어:90
//		수학:80
//		평균:90.0
//python:Hybrid한OOP언어 (자바랑 같은 포지션)
// 		분석툴
//		객체
//----------------------전처리
//5)1등학생 정보출력
//	학생들
public class UCIOMain3 {
	public static void main(String[] args) {
	
		FileInputStream fis;
		BufferedReader br = null;
		try {
			fis=new FileInputStream("C:\\lee\\work space\\Java  수업\\student.csv");
			InputStreamReader isr=new InputStreamReader(fis,"utf-8");
			br=new BufferedReader(isr);
			String l=null;
			String []l2=null;
			Student s=null;
			//배열:만들떄 사이즈 고정
			//		사이즈 모르면?
			// 		바꾸지도 못
			//		=>못써먹음
			
			
			while ((l=br.readLine())!=null) {
				s=new Student(l);
				s.printInfo();
				
				
				
				//split
				//stringtokenizer
				
			}
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
