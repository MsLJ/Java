package com.ms.may021ucc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UCCMain3 {
	//DataBaseManagementSystem
	//보안성 높고,네트워크,다양한 기능있는 파일을 지원해주는
	//OracleDB:90%
//	MySQL
//	MariaDB
//	MSSQL
//	cubrid:국산
//	OracleDB서버
//	1)몇명이 한 조->DB서버 빈컴 한대 서버로 만들어서 같이 쓰기
//	2)그냥 빈 컴 한대 혼자 쓰기
	
	
	// 2015/01/01~2022/12/31까지 서울 지하철 운행정보
	// 노선별로 이용객수 합계
	// 3호선->???
	public static void main(String[] args) {
		FileInputStream fis;
		BufferedReader br = null;
		try {

			// 불러냈고 그안에 있는 내용물들을 분리해줘야할 클래스가 필요하지 않을까?
			fis = new FileInputStream("C:\\lee\\work space\\subway.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			String line = null;
			String[]line2=null;
			long sum=0;
			//long이 범위가 더 넓어서 int로 하면 범위를 벗어날수도 있기에 데이터 분석할때 long 사용 
			HashMap<String, Long>hm=new HashMap<>();
			while ((line = br.readLine()) != null) {
				line2=line.split(",");
				sum=Long.parseLong(line2[6])+Long.parseLong(line2[7]);
				if (hm.containsKey(line2[4])) {
					hm.put(line2[4], hm.get(line2[4])+sum);
					
				}else {
					hm.put(line2[4], sum);
				}

			}
			Set<String>no=hm.keySet();
			ArrayList<String>no2=new ArrayList<>(no);
			for (String n : no2) {
				System.out.println(n);
				System.out.println(hm.get(n));
				System.out.println("--------");
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
