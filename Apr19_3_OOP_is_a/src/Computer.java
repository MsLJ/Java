
public class Computer extends Product {
	String cpu;
	int hdd;
	int ram;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Computer(String name, int price, String cpu, int hdd, int ram) {
		super(name, price);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}



	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(cpu);
		System.out.println(hdd);
		System.out.println(ram);
	}
	

}
