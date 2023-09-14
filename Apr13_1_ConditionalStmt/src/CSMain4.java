//<<(shift연산자)
//	1<<3
//	1을2진수로 바꾸고:1
//	3칸 왼쪽으로 밀고, 빈자리는0으로 채우고
//	:1000
//	1000을 10진수로 바꾸면:8

//
//	충전:1<<5=
//	키즈존:1<<4=
//	24시간:1<<0=1
//	흡연실:1<<1=2
//	주차장:1<<2=4
//	와이파이:1<<3=8

public class CSMain4 {
	public static void main(String[] args) {
		//ctrl(left)+ f11:실행 
		//f11:디버그
		
		//breakpoint->f11->f6(다음줄 실행)...
		int option = 13;// 8+4+1
		
		//for+list

		if (option >= (1<<3)) {
			System.out.println("와이파이");
			option -= (1<<3);
		}
		
		if (option >= (1<<2)) {
			System.out.println("주차장");
			option -= 1<<2;

		}
		if (option >= 1<<1) {
			System.out.println("흡연실");
			option -= 1<<1;
		}
		if (option >= 1<<0) {
			System.out.println("24시간");
		}
	}
}
