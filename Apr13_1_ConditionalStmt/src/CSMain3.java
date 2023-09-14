import java.util.Scanner;

//비만도
//고도 비만 : 35 이상
//중(重)도 비만 (2단계 비만) : 30 - 34.9
//경도 비만 (1단계 비만) : 25 - 29.9
//과체중 : 23 - 24.9
//정상 : 18.5 - 22.9
//저체중 : 18.5 미만
public class CSMain3 {

	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름:");
		String n=k.next();
		return k.next();
	}

	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("체중(kg):");
		double w = k.nextDouble();
		return k.nextDouble();

	}

	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키(m):");
		double h = k.nextDouble();
		//	if(h>3){
			// return h/100;
		//} else{
		// return h;
		//}
		return (h > 3) ? (h / 100) : h;
	}
	// return (h>3)? getHeight():h;
	
	public static double calcBMI(double w,double h) {
		return w/(h*h);
	}
	public static String judge(double b) {
		if(b>=35) {
			return "고도 비만";//값 주고 함수 끝
			
		} 
		if (b>=30) {
			return "중도 비만";
		}
		if (b>=25) {	
			return "경도비만";
			
		}if (b>=23) {
			return"과체중";
			
		}if (b>=18.5) {
			return "정상";
			
			
		}
		return "저체중";
	}
	public static void printResult(double b, String r,String n) {
		System.out.printf("BMI:%.1f\n",b);
		System.out.printf("%s씨는%s\n",n,r);
	}
	public static void main(String[] args) {
			String name=getName();
			double height=getHeight();
			double weight=getWeight();
			double bmi=calcBMI(weight,height);
			String result=judge(bmi);
			
			printResult(bmi,result,name);
	}

}
