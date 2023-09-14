
public class Rice extends Menu {
	String spicy_level;
	public Rice() {
		// TODO Auto-generated constructor stub
	}

	public Rice(String name, int price, String spicy_level) {
		super(name, price);
		this.spicy_level = spicy_level;
	}

@Override
public void printInfo() {
	// TODO Auto-generated method stub
	super.printInfo();
	System.out.println(spicy_level);
}
	

}
