
public class PrintMain {
	public static void main(String[] args) {
		String name = "김밥천국";
		// %s:String값 들어올 자리
		System.out.printf("이름:%s\n", name);

		int tableCount = 13;
		// %d:정수값 들어올 자리
		// %05d:정수값 들어올 자리 (5자리로 빈자리 0)
		System.out.printf("테이블수:%d\n", tableCount);
		System.out.printf("테이블수:%06d\n", tableCount);

		double score = 4.51234;
		// %f:실수값 들어올 자리
		// %.3f:실수값 들어올 자리 (소수점 이하 3자리로(반올림)
		System.out.printf("별점:%f\n", score);
		System.out.printf("별점:%.4f\n", score);

		boolean isReservable = true;
		// %b
		// 자주 사용하지는 않음
		System.out.printf("예약가능:%b\n", isReservable);
		
		System.out.printf("%s,%d자리\n",name,tableCount);
		
		System.out.println("%");
		System.out.printf("%%");
	}

}
