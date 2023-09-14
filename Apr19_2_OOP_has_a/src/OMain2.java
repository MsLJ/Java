
public class OMain2 {
	public static void main(String[] args) {
		Human h=new Human("김길동","수원");
		h.printInfo();
		System.out.println("------");
		//이름이 김판서,집이 안양, 아들이 저 김길동인 사람
		//정보출력(아들 정보도 다)
		
		Human h2=new Human("김판서","안양",h);
		h2.printInfo();
		System.out.println("------");
		
		//이름은 삼성,직원100,사장이 저 김판서인 회사
		//정보출력(사장님 정보까지)
		Company c=new Company("삼성",100,h2);
		c.printInfo();
		System.out.println("----------");
		
		Handphone hp=new Handphone(2000000,"갤럭시",c);
		hp.printInfo();
		System.out.println("--------");
		
		
		System.out.println(hp.name);//폰 모델명
		System.out.println("-----------");
		hp.printInfo();//폰 전체정보
		System.out.println("----------");
		System.out.println(hp.maker.worker);//폰 만든회사 직원수
		System.out.println("-----------------");
		//폰 만든회사 전체정보
		//폰 만든회사 사장님 집 어디
		//폰 만든회사 사장님 자식 이름
		//폰 만든회사 사장님 자식 전체 정보
		hp.maker.printInfo();
		System.out.println(hp.maker.boss.adress);
		System.out.println(hp.maker.boss.child.name);
		hp.maker.boss.child.printInfo();
		
		
	}

}
