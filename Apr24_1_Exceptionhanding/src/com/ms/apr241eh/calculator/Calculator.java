package com.ms.apr241eh.calculator;

// OOP:코드 재사용

//내 동생의 요청으로 시작된 프로젝트
// 나누기 기능이 있는데->다른 프로젝트에서도 쓰일듯
// 챙겨두자->.jar

//예외처리
//y에 0은 들어가면 안됨(수학이론)
//개발자가 대비는 해 둬야
// 1) 직접처리: try- catch- finally
public class Calculator {
	public static int divide(int x, int y) {
		try {
			return x / y;
			
		} catch (Exception e) {
			System.out.println("나누기 0이 안됌");
			return -500;
		}finally {
			System.out.println("계산 끝");
		}
	}

// 2) 미루기: throws
// divide2를 수행하다가 Arith...가 발생한거
// divide2를 호출한쪽에서 처리해라
	public static int divide2(int x,int y) throws ArithmeticException{
		return x/y;
	}
	
}
