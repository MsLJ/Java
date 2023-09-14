import java.util.Scanner;

public class ClMain_test {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.print("식당:");
		String name=k.next();
		System.out.print("테이블 수:");
		int table=k.nextInt();
		System.out.print("몇 도:");
		double ag=k.nextDouble();
		System.out.println("---------");
		System.out.printf("%s,%d,%.1f\n",name,table,ag);
	}

}
