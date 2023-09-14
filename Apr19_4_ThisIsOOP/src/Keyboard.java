//Scanner:키보드 입력받는기능
//sc는 파이널이 붙어있어서 상속 메소드는 불가능

public class Keyboard extends sc {
	Scanner k = new Scanner(System.in);

	public Keyboard() {
		// TODO Auto-generated constructor stub
	}

	public int printInfo(int a) {
		int b = k.nextInt(a);

	}

}
