package com.ms.apr284ucc.main;

import java.util.ArrayList;
import java.util.Comparator;

//[]
//	만들떄 사이즈 고정
//	만들때 사이즈 모르면? 못만드는
//인덱스기반도 넣기 불가
//	사이즈 변경 불가
//	자료형 섞을수 없음
//	=>간단히 써먹을때나 쓰지,본격적 데이터들 표현하기에는
//----------------------------------------------
//Collection
//		자료형 섞어서 넣을 수 있는데, 그게 딱히..
//		객체만 넣을 수 있음
//		List계열 :가변사이즈 배열
//		Set계열
//		Map계열(dictionary)
//<클래스명>:generic
//	그 객체만 쓸수있게 강제

public class UCCMain {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();// 기존 배열과 다르게 size를 정해놓지 않아도 됌
		al.add(12);// 추가가능
		al.add(13);
		al.add(15);
		al.add("ㄱ");// String도 섞어넣기 가능하지만 굳이 문자랑 섞어서?
		al.add(121);
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println("---------");
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(12);// int를 넣었다x Integer로 자동변환 자바측에서
		al2.add(11);
		al2.add(13);
		al2.add(14);
		al2.add(17);// 뒤에추가
		al2.add(0, 999);// 0번 위치에 999를 지정추가
		al2.set(2, 3216);// 2번위치에 있는걸 3216으로 바꾸기
		al2.remove(3);// 지우기

		// 이해가 안된다
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);//오름차순
//				return o2.compareTo(o1);// 내림차순
			}
		};
		al2.sort(c);
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));

		}
		System.out.println("------------");
		for (Integer integer : al2) {
			System.out.println(integer);
		}

	}

}
