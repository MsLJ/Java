import java.util.Iterator;

public class Pratice {
	public static void main(String[] args) {
		int 거스름돈=16320;
		//게산이 많아 ->cpu많이
		int 화폐=50000;
		int 몇개;
		int 오이=5;
		
		while (true) {
			if (화폐==10) {
				break;
				
			}
			몇개=거스름돈/화폐;
			System.out.printf("%d짜리:%d\n",화폐,몇개);
		
			거스름돈%=화폐;
			화폐/=오이;//오이랑 나눈값 나머지 저장?
			오이=(오이==5)?2:5;
			
		
			
			
		}
		
		
		
//		for (int i = 0; i <= 7; i++) {
//			System.out.println(화폐단위);
//			if (i%2==0) {
//				
//				System.out.println(화폐단위/5);
//				
//				
//			} else {
//				
//				System.out.println(화폐단위/2);
//				System.out.println(화폐단위%2);
//
//			}
			
			
		}
		
		
//		
//		int[]화폐단위= {50000,10000,5000,1000,500,100,50,10};
//		int 몇개;
//		for (int 화폐 : 화폐단위) {
//			몇개=거스름돈/화폐;
//			System.out.printf("%d원짜리:%d\n",화폐,몇개);
//			거스름돈%=화폐;
//			
//		}
		
	}


