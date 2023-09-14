//constructor
//		상속 안됨
//		하위클래스(Milk) 객체 만들면
//		=> 자동으로 상위클래스(product) 기본생성자를 불러버림
//		=>다른거 부르면 
//생성자를 전혀 작업 안하면->기본생성자 자동으로 만들어줌
//생성자 작업하면->기본생성자 안만들어줌

//상품 is a 자바객체
public class Product extends Object {
	
	String name;
	int price;

//	생성자
	public Product() {
		System.out.println("ㅋ");
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price) {
		//super(); //상위클래스 기본생성자
		this.name = name;
		this.price = price;
		System.out.println("ㅎ");
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	

}
