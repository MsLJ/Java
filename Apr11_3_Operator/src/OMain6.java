import java.util.Scanner;

//바퀴둘레: 
//앞 기어 톱니수: 
//뒷 기어 톱니수: 
//발 몇번 굴렀나:
//-------------
//이동거리: 바퀴둘레*발구른횟수*기어비

//double 기어비=앞기어수/(double) 뒷기어수;
public class OMain6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.printf("바퀴둘레:");
		double wheel=k.nextDouble();
		
		System.out.print("앞 기어 톱니수:");
		int frontchain=k.nextInt();
		
		System.out.print("뒷 기어 톱니수:");
		int backchain=k.nextInt();
		
		System.out.print("발 몇번:");
		int count=k.nextInt();
		
		
		System.out.println("-----------");

		double gear=frontchain/(double)backchain;
		
		double shift=(wheel*count*gear);
		
		System.out.printf("이동거리:%f\n",shift);
		
		
		
		
		
		
		
		
		
		
	}
}
