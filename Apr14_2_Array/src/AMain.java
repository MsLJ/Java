//조건문:if/switch
//반복문:for/while
//배열
//컬렉션
//		변수 1=데이터n

public class AMain {
	public static void main(String[] args) {
		// 자료형[] 변수명 =new 자료형[데이터수];
		int[] eng = new int[3];
		eng[0] = 90;
		eng[1] = 80;
		eng[2] = 60;
		// 자료형[] 변수명=new 자료형 {값,값....}
		int[] mat = new int[] { 50, 30, 70 };

		// int kor[];
		// 자료형[] 변수명={값,값,.....}
		// 중요! 배열은 0부터 시작!
		// 값접근:변수명[인덱스]
		int[] kor = { 100, 30, 70 };
		System.out.println(kor[2]);
		//데이터 수:변수명.length
		System.out.println(kor.length);
		
		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
	}

}
