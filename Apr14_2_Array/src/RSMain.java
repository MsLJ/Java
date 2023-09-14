
//반복문
//	반복횟수:for
//	배열탐색용:foreach<-Python
//	반복조건:while/do-while
//  컬렉션

//part1:기본
//part2:OOP
//part3:유용한 내장 기능 소개

public class RSMain {

	public static void main(String[] args) {
		double[] pizzaSize = { 55.5, 22.3, 123.4, 12.4 };

		for (int i = 0; i < pizzaSize.length; i++) {
			double f = pizzaSize[i];
			System.out.println(f);

		}
		System.out.println("-------");
		// for(자료형 변수명:배열명){
		//
		// }

		// 순서조절불가
		// i가 없어서->프로그램적으로 활용도 낮음
		for (double f : pizzaSize) {
			System.out.println(f);

		}

	}
}
