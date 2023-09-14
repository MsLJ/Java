package com.ms.may021ucc.main;

import java.util.ArrayList;import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class UCCMain {
	// Collection
	// List계열: 가변사이즈 배열
	// Set계열: 중복자동제거,순서가 뒤죽박죽
	// Map계열:?
	public static void main(String[] args) {
		// set 계열
		HashSet<String> hs = new HashSet<>();
		hs.add("z");
		hs.add("z");
		hs.add("z");
		hs.add("w");
		hs.add("w");
		hs.add("e");
		hs.add("e");
		hs.add("e");
		System.out.println(hs.size());

		// Set->List
		ArrayList<String> al = new ArrayList<>(hs);
		for (String string : al) {
			System.out.println(string);
		}
		System.out.println("--------");
		HashSet<Coffee>coffees=new HashSet<>();
		coffees.add(new Coffee("아메리카노",3000));
		coffees.add(new Coffee("아메리카노",3000));
		coffees.add(new Coffee("아메리카노",3000));
		System.out.println(coffees.size());
		//아메리카노,3000원 커피
		
		Coffee c=new Coffee("아아",2000);
		coffees.add(c);
		coffees.add(c);
		coffees.add(c);
		System.out.println(coffees.size());
		
		System.out.println("------------");
		//중복이 있는
		//기본형급 (int,double,String...)List
		//의 중복 제거하려면
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(10);
		al2.add(10);
		al2.add(10);
		al2.add(102);
		al2.add(102);
		al2.add(103);
		al2.add(103);
		al2.add(104);
		al2.add(1045);
		al2.add(1045);
		al2.add(104);
		al2.add(1047);
		al2.add(1047);
		al2.add(104);
		
		HashSet<Integer> hs2=new HashSet<>(al2);
		//List->Set
		System.out.println(hs2.size());
		al2=new ArrayList<>(hs2);
		
		for (Integer integer : hs2) {
			System.out.println(integer);
		}
		
		System.out.println("----------");
		//ㄹ또 자동번호 자동생성기
		//1~45랜덤한 숫자 6개 오름차순 정렬해서
		Random r=new Random();
		
		HashSet<Integer>lotto=new HashSet<>();
		while (true) {
			lotto.add(r.nextInt(45)+1);
			if (lotto.size()==6) {
				break;
				
			}
		}
		
		ArrayList<Integer>lotto2=new ArrayList<>(lotto);
		lotto2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
//			for (int i = 0; i < lotto2.size(); i++) {
//		System.out.println(lotto2.get(i));
//			
//			
//		}
		for (Integer l : lotto2) {
			System.out.println(l);
		}
	}

}
