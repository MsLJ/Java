
public class Milk extends Product {
	String expiration_date;
	
	public Milk() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Milk(String name, int price, String expiration_date) {
		//super();
		super(name, price);
		this.expiration_date = expiration_date;
	}




	@Override
	public void printInfo() {

		super.printInfo();
		System.out.println(expiration_date);
	}

}
