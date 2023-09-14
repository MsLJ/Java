import java.util.Scanner;

//구매한 물건가격:35620
//낸 돈:40000
//--------------------
//거스름돈:4380
//5만원짜리 0개
//1만원짜리 0개
//5천원짜리 0개
//1천원짜리 4개
//5백원짜리 0개
//1백원짜리 3개
//5십원짜리 1개
//1십원짜리 3개
public class OMain5 {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("구매한 물건가격:");
		int price = k.nextInt();

		System.out.print("낸 돈:");
		int money = k.nextInt();
		System.out.println("-----------");

		int remain = (money - price);
		System.out.printf("거스름돈:%d\n", remain);

		int fivemanweon = remain / 50000;
		System.out.printf("5만원짜리:%d\n", fivemanweon);
		// remain=remain-(50000*fivemanweon);
		//remain = remain % 50000;
		remain%=50000;
		
		int man=remain/10000;
		System.out.printf("만원짜리:%d\n",man);
		remain%=10000;
		
		//....

	}

}

//문법:찾아서 하면 됨
//수학적 사고력:그 문법을 적재적소에 활용하는
//				정보올림피아드
//	수학익힘책 각 단원 마지막문제
//	식으로 표현하기가..
