package com.ms.apr216eh.main;

import java.util.Scanner;

//error:Java문법에 안맞게써서 
//기계어로 번역이 불가능한 상태 
//최종산출물이 못나오겠고 개발자 잘못

//warning:지저분한 소스
//		문제없이 최종산출물까지 나오는
//		정리해주는게 좋을것
//		개발자 잘못

//exception: 프로그램에는 문제없는
//			실행중에 외부적인 요인에 의해 제대로 안되는
//			개발자 잘못-x
//			누군가는 해결해야->개발자가 좀 대비를...

//

//2:OOP
//............
//3:유용한 내장 클래스
public class EHMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("x:");
		int x = k.nextInt();
		System.out.print("y:");
		int y = k.nextInt();
		System.out.println("-----------");
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println("---------");
		// 1)직접처리(try-catch-finally)
//		try {
//			//여기를 일단 실행
//		} catch (예외종류 변수명) {
//			//그예외가 발생하면 바로 이쪽으로
//		}
//		} catch (예외종류 변수명) {
//			//그예외가 발생하면 바로 이쪽으로
//		}...
		// }finally{
//		예외 발생 여부와 상관없이 무조건 실행
		// return보다 먼저
//	}
		// 2)...

		// 정상:47-48-49
		// y에0:47-48(AE발생)-50-51
//		
//		try {
//			System.out.println(x/y);	
//			System.out.println("끝");
//		} catch (ArithmeticException e) {
//			//대비책
//			System.out.println("나누기 0은 없다");
//		}
		// 정상:57-58-59-60
		// y에 0: 57-58(AE)-61-62
		// y에3: 57-58-59-60(AE)

		// Avengers -Ironman
		// Avengers -Hulk

		// Exception-Arith

		// 개발하면서 상황파악 e.printStackTrace(); 출시하고 지우기
		try {
			System.out.println(x / y);

			int[] ar = { 21, 123, 213 };
			System.out.println(ar[y]);
			System.out.println("끝");
		} catch (Exception e) {
			e.printStackTrace();// 개발하면서 상황파악
			// 대비책
			System.out.println("하여튼 문제 생긴");
		} finally {
			System.out.println("문제가 생겼든지 말든지 무조건");

		}

	}

}
