
public class Dog {
	int age;
	String name;
	Human master;
	public Dog() {
		
		// TODO Auto-generated constructor stub
	}
	public Dog(int age, String name ) {
		
		this.age = age;
		this.name = name;
	}
	public void printInfo() {
		System.out.printf("안녕 내이름은 %s고,%d살이야\n",name,age);
	}
	
	

}
