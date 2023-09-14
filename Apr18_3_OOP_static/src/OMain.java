//설계-번역(코딩)->.java
//.java-번역(compile)->.class
//.class-압축->		.jar
//.jar- 실행->
//-----------------------------
//JRE가JVM을 실행하는 OS에 맞게 만들어 올리고->
//프로그램 소스(기계어상태)가 stack에 깔리고->
//static멤버변수들 static영역에 만들고->
//JVM이 OMain.main(...)을 호출

//Java: Perfect한 OOL
//Python: Hybrid한 OOL

public class OMain {
	public static void main(String[] args) {
		System.out.println(Gaezzang.MAKER);
		Gaezzang.test();
		//static일때
		System.out.println("--------");
		
		Gaezzang g=new Gaezzang();
		g.name="가정의달 특별세트";
		g.price=39900;
		g.weight=5;
		
		//생산자 이름
		
		System.out.println("-------");
		
		Gaezzang g1=new Gaezzang();
		g1.name="간장게장";
		g1.price=30000;
		g1.weight=5.4;
		
		
		System.out.println("-----------");
		System.out.println(g1);
		System.out.println(g);
		
		//Gaezzang.MAKER="고공";
		g1.printInfo();
		g.printInfo();
		//게장
		// 	품명이 가정의달특별세트
		//	무게가 5kg
		//	가격이 39900
		//	정보출력
		System.out.println("------------");

	}

}
