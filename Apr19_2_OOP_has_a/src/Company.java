
public class Company {
	String name;
	int worker;
	Human boss;
	
	
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, int worker, Human boss) {
		super();
		this.name = name;
		this.worker = worker;
		this.boss = boss;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(worker);
		System.out.println(boss.name);
		
	}

}
