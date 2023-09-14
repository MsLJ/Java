import java.util.Scanner;

public class test {
	//바퀴둘레: 
	//앞 기어 톱니수: 
	//뒷 기어 톱니수: 
	//발 몇번 굴렀나:
	//-------------
	//이동거리: 바퀴둘레*발구른횟수*기어비

	//double 기어비=앞기어수/(double) 뒷기어수;
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.print("바퀴둘레:");
		double wheel=k.nextDouble();
		System.out.print("앞 기어:");
		int fgear=k.nextInt();
		System.out.print("뒷 기어:");
		int bgear=k.nextInt();
		System.out.println("발 몇 번:");
		int foot=k.nextInt();
		System.out.println("------------");
		double dgear=fgear/bgear;
		double sum=wheel*dgear*foot;
		System.out.printf("총이동거리는:%.1f입니다",sum);//소수점 자리 만약에 3자리수까지 나오고싶다=>%.3f
	}

}
