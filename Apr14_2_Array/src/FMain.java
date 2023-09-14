
//배열은 참조형
//Call by Reference, Call by Value
//=>기본형은 함수에서 건드려도 원본에는 영향없음
// 	참조형은 함수에서 건들면 원본에 영향이 감

public class FMain {
	public static void test(int a, int[] b,int[]c) {
		System.out.println(a);
		System.out.println(b[0]);//232
		System.out.println(c[0]);//455
		a = 100;
		b[0] = 100;//232 0=100
		c= new int[]{100,200};
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);

	}

	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };//232
		System.out.println(b);
		int[] c = { 10, 20 };//455
		System.out.println(c);
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
		test(a, b,c);
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
	}

}
