//식당
//
public class OMain3 {
	public static void main(String[] args) {
		Rice r=new Rice("제육덮밥",6000,"1단계");
		r.printInfo();
		//메뉴명이 제육덮밥 가격이 6000원 맴기 1단계
		//출력
		System.out.println("----------");
		Soju s=new Soju("처음처럼",4000,12);
		s.printInfo();
		//메뉴명이 처음으로 가격이 4000원 도수 12도인 술
		//출력
		System.out.println("--------------");
		Water w=new Water("삼다수",0);
		w.printInfo();
		
		//메뉴명이 삼다수,가격이 0원 물
		//출력
	}
}
