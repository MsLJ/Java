import java.util.Scanner;

//연산자(operator)-stack영역이 대상
//	 =  :대입연산자
//		우항에있는거 좌항에넣어라
//		무조건 제일 마지막
//  + - * / % : 산술연산자
//+= -= *= /= %= :산술+대입연산자
//++ --			 :1증가/1감소
public class OMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("x:");
		int x = k.nextInt();

		System.out.print("y:");
		int y = k.nextInt();

		System.out.println("------");
		System.out.printf("x는%d,y는 %d\n", x, y);

		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		int e = x % y;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("-------");
		String s = "ㅋ";
		String f = x + s;// 뭐(??)+String=붙여서 String으로 변환
		System.out.println(f);

		// int->String
		int g = 10;
		String g2 = g + "";
		System.out.println(g2);
		System.out.println("-----");
		// String*int =>반복(python에서만,Java에서는 안됨)
		// System.out.println(s*3);

		// int,int를 계산=>int
		// int,double계산=>double
		// d,d=>d
		// 둘중에 적어도 하나는 double
		double h = x / (double) y;
		System.out.println(h);

		
		//Java에서는 1글자=2bytes
		//=>1글자라도 덜 쓰면 ->프로그램 용량 줄
		
		//근데 요즘 컴 좋은데 뭘 그렇게까지
		
		//x = x + 3;// x값 3증가
		x+=3;
		System.out.println(x);
		
		//1증가:뭔가 갯수 셀때
		//1감소:뭔가 갯수 셀때
		
		
		//y값 1깎기
		//y=y-1
		//y-=1;
		y--;
		System.out.println(y);
				

	}

}
