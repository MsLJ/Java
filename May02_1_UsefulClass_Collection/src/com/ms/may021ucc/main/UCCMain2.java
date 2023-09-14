package com.ms.may021ucc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UCCMain2 {
	// 조건문
	// 반복문
	// List+Map
	// 특징:OOP,남의 lib잘쓰기
//-------------------------

	// Avengers-Ironman,Hulk...
	// List-ArrayList,Vector
	// Set-HashSet,TreeSet..
	// Map-HashMap,HasgTable...

	// Collection
	// List계열: 가변사이즈 배열
	// Set계열: 중복자동제거,순서가 뒤죽박죽
	// 기본형급(int,double,String....)List의 중복 제거
	// 기본형급 중복 제거
	// Map계열(Python의 dict):순서x,키-값
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("비타", 500.0);
		hm.put("뽀로로 키", 185.7512);
		hm.put("가게 사이즈", 1422123.123);
		hm.put("가게 사이즈", 1423.123);// 이미 있는 키값으로 값을 또 넣으면 값이 바뀜
		System.out.println(hm.get("가게 사이즈"));// for문이랑 인연이없는

		// 키값만 추출
		Set<String> keys = hm.keySet();
		ArrayList<String>keys2=new ArrayList<>(keys);
		for (String string : keys2) {
			System.out.println(string);
			System.out.println(hm.get(string));
			System.out.println("--------------");
		}
		System.out.println(hm.containsKey("뽀로로 몸무게"));//키값이 true false containskey()
		System.out.println(hm.containsKey("뽀로로 키"));
	}
}
