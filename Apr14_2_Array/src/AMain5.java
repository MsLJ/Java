import java.util.Scanner;

//거스름돈 계산
public class AMain5 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int[] money = { 50000, 10000, 1000, 500, 100, 50, 10 };
		System.out.print("내가 가지고 있는 돈:");
		int mymoney = k.nextInt();
		System.out.print("구매한 물건의 가격:");
		int price = k.nextInt();
		System.out.println("-----------");
		int bill = mymoney - price;
		int gusrmdon;

		System.out.println(bill);
		for (int i = 0; i <= money.length - 1; i++) {
			System.out.println(bill / money[i]);
			System.out.println(bill % money[i]);
			gusrmdon = bill % money[i];
			System.out.println(gusrmdon);
			

		}
	}
}
