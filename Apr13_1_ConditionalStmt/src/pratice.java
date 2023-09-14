import java.util.Scanner;

public class pratice {
	static Scanner k=new Scanner(System.in);
	
	public static String getName() {
		System.out.print("이름:");
		String n=k.next();
		return n;
		
		
	}
	public static double getWeight() {
		System.out.print("몸무게(kg):");
		double w=k.nextDouble();
		return w;
		
	}
	public static double getHeight(){
		System.out.print("키(cm):");
		double h=k.nextDouble();
		return(h<=10)?h*100:h;
		
	}
	public static double calculateBMI(double w,double h) {
		return w/(h/100);
		
	}
	public static void main(String[] args) {
		String name=(getName());
		double weight=(getWeight());
		double height=(getHeight());
		double bmi=(calculateBMI(weight, height));
		System.out.printf("%s님의 bmi는%.1f입니다",name,bmi);
	
	}

}
