//멤버변수에 값 대입: 쓰레기코드
//		그럼에도 불구하고 하고싶을때 언제
//		공통속성=>static
//		기본값



//static 멤버변수:공통속성
//		=>static영역에 하나만 만들어지고,다 같이쓰게됨
//		=>메모리 절약
//		객체가 없어도 쓸수있는 속성(클래스명.멤버변수명으로 접근)

//final 멤버변수
// 	 	상수화(못바꾸게 됨)
//		다 대문자로

//static 메소드
//		메모리 절약이 static멤버변수랑은 다른 느낌으로 있음
//		객체가 없어도 쓸수있는 기능
//		static이 아닌거 못씀

//
public class Gaezzang {
	String name;
	double weight;
	int price;
	static final String MAKER="김수미";//공통속성 static
	
	public static void test() {
//		System.out.println(name);
		System.out.println(MAKER);
		System.out.println("ㅋ");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(weight);
		System.out.println(price);
		System.out.println(MAKER);
	}
	
	

}
