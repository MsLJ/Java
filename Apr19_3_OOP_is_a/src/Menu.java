//constructor:객체 만들때 쓰는 메소드
//	1)생성자 하나도 안만들어놓으면
//		->Java가 기본생성자 자동으로 만들어줌
//		->생성자가 뭐라도 있으면:기본생성자 안만들어줌
//	2)다
// 1.문화적으로 만들어두는것
//2.하위클래스 객체를 만들면 자동으로 상위 클래스 생성자 호출
//3. Jsp/Spring이 자동으로 객체를 만들때 기본생성자를 부름
public class Menu {
	int price;
	String name;

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price) {
		super();
		this.price = price;
		this.name = name;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}

}
