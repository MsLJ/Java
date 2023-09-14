
public class Human {
	int age;
	String name;
	String adress;
	Dog pet;
	Human child;
	public Human() {
		// TODO Auto-generated constructor stub
	}
	public Human( String name, String adress,Dog pet) {
		//super();
		this.name = name;
		this.adress=adress;
		
	}
	

	public Human(String name, String adress, Human child) {
		super();
		this.name = name;
		this.adress = adress;
		this.child = child;
	}
	
	public Human(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(adress);
		if (child!=null) {
			child.printInfo();
			
		}
		
	}
}
