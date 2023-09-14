import java.util.Scanner;

//Java->JSP->EJB(Enterprise JavaBean)
//				무겁고 복잡하고 어렵고...
//				->Spring

//DTO(Data Temp/Transfer Object)
//VO(Value Object)
//POJO(Plain Old Java Object)
//JavaBean
public class Guest {
	String name;
	double weight;
	double height;
	Scanner mouth=new Scanner(System.in);
	double bmi;
	String status;
	
	public String tellName() {
		//말할 준비
		return mouth.next();
	}
	
	public double tellHW() {
		return mouth.nextDouble();
		
	}
	

}
