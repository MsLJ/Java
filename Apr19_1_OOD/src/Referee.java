
public class Referee {
	static String[]ruleBook= {null,"가위","바위","보"};
	
	

	public static You callBlueCorner() {
		System.out.println("청팀 입장하세요");
		return new You();
	}

	public static Me callRedCorner() {
		System.out.println("홍팀 입장하세요");
		return new Me();
	}
	
	public static void explain_rule() {
		System.out.println("1.가위");
		System.out.println("2.바위");
		System.out.println("3.보");
		System.out.println("--------");
	}
	public static int requestBlueCornerFire(You y) {
		return y.fire();
		
		
	}
	
	public static int requestRedCornerFire(Me m) {
		System.out.print("뭐:");
		int mp=m.fire();
		return(mp<1||mp>3)?requestRedCornerFire(m):mp;
		
	}
	public static void tellHand(int up,int mp) {
		System.out.printf("너:%s\n",ruleBook[up]);
		System.out.printf("나%s\n",ruleBook[mp]);
		
//		String s=""; 주소값있는거 근데 안에값 없는거
//		String s2=null;주소값도 없는거 텅텅
		
	}
	
	public static int judge(int up,int mp) {
		
		int t=up-mp;
		if (t==0) {
			System.out.println("무");
			return 0;
		}else if (t==-1||t==2) {
			System.out.println("패");
			return 123456;
			
		}else {
			System.out.println("승");
		    return 1;
		}
		public static void start() {
			
			You y=callBlueCorner();
			Me m=callRedCorner();
			explain_rule();
			int yourpaper;
			int mypaper;
			int t=0;
			tellHand(yourpaper,mypaper);
			t=judge(yourpaper,mypaper);
			if (t==123456) {
				break;
				while (true) {
					yourpaper=requestBlueCornerFire(y);
					mypaper=requestRedCornerFire(m);
					tellHand(yourpaper,mypaper);
					judge(yourpaper,mypaper);
					
				}
				m.win+=t;
			}
			tellResult(m);
			
		}
		public static void tellResult(Me m) {
			System.out.printf("%d연승\n",m.win);
			
		}
	}


}
