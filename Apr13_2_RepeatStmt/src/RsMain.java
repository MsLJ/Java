import java.util.Iterator;

// 반복문
//		반복횟수:for
//		반복조건:while,do-while

//for(변수초기화[1]; 조건식[2,5]; 변수증감[4,7]){
//	 내용[조건식 만족하면[3,6]]
//}
public class RsMain {
	public static void main(String[] args) {
		// ㅋ5번
		for (int i = 0; i < 5; i++) {
			System.out.println("ㅋ");

		}
		System.out.println("---------");
		// 1~10을 출력
		for (int i = 1; i < 11; i++) {
			System.out.println(i);

		}
		System.out.println("---------");
		// 10~1출력
		// 1~10까지 홀수만 출력
		// -5~5까지 짝수는 숫자/홀수는 "홀" 이라는 글자
		for (int i = 10; i > 0; i--) {
			System.out.println(i);

		}
		for (int i = 1; i < 11; i += 2) {
			System.out.println(i);

		}
		for (int i = -5; i < 6; i++) {

			System.out.println((i % 2 == 0) ? i : "홀");

		} // 1+2+...+10까지 다 더하면
			// 반복문속에서 변수 안만드는쪽으로
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.println(sum);
			// 5!=?
		} // 10~50까지 짝수들만 다 더하면?
		System.out.println("-------");

		int gob = 1;
		for (int i = 1; i < 6; i++) {
			gob *= i;
			System.out.println(gob);

		}
		System.out.println("----------");
		int sum2 = 0;
		for (int i = 10; i < 51; i += 2) {
			sum2 += i;

		}
		System.out.println(sum2);
		System.out.println("-------");
		int result = 0;
		int n = 1;
		for (int i = 1; i < 51; i++) {
			result += (i * n);
			n *= -1;
		}
		System.out.println(result);

		for (int i = 1; i < 10; i++) {
			System.out.printf("2x%d=%d\n", i, 2 * i);

		}
		// 2단~9단(표 모양)
		System.out.println("-----");
		for (int dan = 1; dan < 10; dan++) {
			for (int i = 2; i < 10; i++) {
				System.out.printf("%dx%d=%d\t", i, dan, dan * i);
			}
			System.out.println();
		}
		System.out.println("-------");

		// 별찍기
//		ㅋ
//		ㅋㅋ
//		ㅋㅋㅋ
//		ㅋㅋㅋㅋ
//		ㅋㅋㅋㅋㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("ㅋ");

			}
			System.out.println();

		}
		System.out.println("------");
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("ㅋ");
			System.out.println();
		}
		System.out.println("--------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {

				System.out.print("  ");

			}
			System.out.println("ㅋ");

		}
		System.out.println("--------");
		// ㅋ
		// ㅋㅎ
		// ㅋㅎㅋ
		// ㅋㅎㅋㅎ
		// ㅋㅎㅋㅎㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j % 2 == 0) ? "ㅋ" : "ㅎ");

			}
			System.out.println();
			// ㅋ
			// ㅎㅎㅎ
			// ㅋㅋㅋㅋㅋ
			// ㅎㅎㅎㅎㅎㅎㅎ
			// ㅋㅋㅋㅋㅋㅋㅋㅋㅋ

		}
		System.out.println("-----------");
		String s;
		for (int i = 0; i < 5; i++) {
			s=i % 2 == 0 ? "ㅋ" : "ㅎ";
			for (int j = 0; j <= i * 2; j++) {
				System.out.print(s);

			}
			System.out.println();
		}

	}
}
