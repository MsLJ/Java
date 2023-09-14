
public class AMain4 {
	public static void main(String[] args) {
//		충전:1<<5=
//		키즈존:1<<4=
//		24시간:1<<0=1
//		흡연실:1<<1=2
//		주차장:1<<2=4
//		와이파이:1<<3=8
		
		String[] options= { "와이파이","주차장","흡연실","24시간"};
		int option=13;
		for (int i =(options.length-1); i >= 0; i--) {
			if (options>=(1<<i)) {
				System.out.println(options[i]);
				option-=(1<<i);
				
			}
			
		}

		
	}
	}
