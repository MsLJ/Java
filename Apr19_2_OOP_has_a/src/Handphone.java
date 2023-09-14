
public class Handphone {
	int price;
	String name;
	Company maker;
	public Handphone() {
		// TODO Auto-generated constructor stub
	}
	public Handphone(int price, String name,Company maker) {
		//super();
		this.price = price;
		this.name = name;
		this.maker=maker;
	}
	public void printInfo() {
		System.out.println(price);
		System.out.println(name);
		System.out.println(maker.name);
		
	}

}
