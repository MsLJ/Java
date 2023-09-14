
public class Notebook extends Computer{
	double weight;
	
	
	public Notebook() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Notebook(String name, int price, String cpu, int hdd, int ram, double weight) {
		super(name, price, cpu, hdd, ram);
		this.weight = weight;
	}




	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(weight);
	}
	

}
