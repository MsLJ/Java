//method overloading
//멤버변수명,지역변수명/파라메터명이 같아도 되고
//,같으면 가까운걸로 쳐 줌
//,멤버변수명으로 인식시켜야하면:this.

public class Snack {
	String name;// 어떤 과자의 이름
	int price;
	String maker;

	// JSP/Spring:자동으로 객체를 기본생성자를 써서 만들어버림
	// 자동으로 기본생성자를 부를때가 있는데
	// 문화
	public Snack() {

	}

	public void test(String name) {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(price);

	}

	// 개발자는 이거 쓸텐데
	// 오버로딩된 생성자(overloaded constructor)
	public Snack(String name, int price, String maker) {
		// super();//?
		this.name = name;
		this.price = price;
		this.maker = maker;
	} // 빈공간 우클릭 source 밑에서3번째

	public void print() {
		// this.은 생략가능
		System.out.println(this.name);
		System.out.println(price);
		System.out.println(maker);
	}

}
