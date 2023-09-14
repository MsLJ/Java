//상속
//	A is a B
//	Son is a Father-x
//	Taxi is a car
public class OMain {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.name="ㅃㄹㄹ";
		p.price=900;
		p.color="빨주노초파란보";
		p.printInfo();
		System.out.println("--------");
		Milk m=new Milk();
		m.name="서울우유";
		m.price=3000;
		m.expiration_date="2023/05/01";
		m.printInfo();
		//우유
		//이름이 서울우유
		//가격이 3000원
		//유통기한 2023/05/01
		//정보출력
		System.out.println("------");
		Computer c= new Computer();
		c.name="매직스테이션123";
		c.cpu="i7-1234";
		c.price=7000000;
		c.hdd=500;
		c.ram=16;
		c.printInfo();
		//컴퓨터
		//이름이 매직스테이션123
		//가격이 70만원
		//cpu가 i7-1234
		//ram 16
		//hdd 500
		//정보출력
		System.out.println("-------");
		Notebook n=new Notebook();
		n.name="그램1234";
		n.hdd=500;
		n.price=1500000;
		n.ram=16;
		n.weight=5;
		n.cpu="i5-1233";
		n.printInfo();
		//노트북
		//그램1234
		//150만원
		//cpu i5-1233
		//ram 16
		//hdd 250
		//5kg
		//print
		
	}

}
