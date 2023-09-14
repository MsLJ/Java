
public class Soju extends Menu{
	double alchol;
	
	public Soju() {
		// TODO Auto-generated constructor stub
	}


	
	public Soju(String name, int price, double alchol) {
		super(name, price);
		this.alchol = alchol;
	}



	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(alchol);
	}

}
