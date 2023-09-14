import java.util.Iterator;

public class Test {
	
	
	public static void main(String[] args) {
		double []pizzasize= {123.21,321.2,123.4};
		double x=0;
		System.out.println(pizzasize[1]);
		for (int i = 0; i < pizzasize.length; i++) {
			System.out.println(pizzasize[i]);
			x+=pizzasize[i];
			System.out.println(x);
			
			
		}
	


}
}