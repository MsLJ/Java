//part 1 :PP(procedural programming)
//			절차지향프로그래밍
//			순서에 맞게 조건문, 반복문 최적으로
//			효율적인 프로그램 만들자
//part2: OOP(Object Oriented programming)
//			객체지향프로그래밍
//			유지보수의 시대를 맞이해서
//			알아보기 편하게 소스 쓰자
//			=>일상언어에 가깝게
//			객체라는걸 써서 Real world를 묘사하자

//알고리즘의 시대->유지보수의 시대
//유지보수에 좋으려면 소스 알아보기편해야

//



// 강사:모르는 사람한테 알게 해주는

public class OMain {
	public static void main(String[] args) {
		//개 이름이 후추=>저장
		//개 나이가 3살=>저장
		//출력
		String name="후추";
		int age=3;
		System.out.println(name);
		System.out.println(age);
		System.out.println("---------");
		//객체는 다 참조형
		//class:객체 만들때 필요한거
		//객체 object/instance:실생활에 존재하는 그 뭐
		//객체 만들기
		// 클래스명 변수명=new클래스명();
		Dog d=new Dog();
		d.name="후추";
		d.age=3;
		//액션
		//method
		d.bark();
		d.showInfo();
		System.out.println("-----------");
		Restaurant r2=new Restaurant();
		r2.name ="굿모닝";
		r2.table=1;
		r2.starPoint=4.2;
		r2.reservable=true;
		r2.printInfo();
		
		System.out.println(r);
		System.out.println(r2);
		//식당
		//그 식당 이름이 김천
		//테이블 수가 10
		//별점 4.5
		//삭덩 정보 출력
		Restaurant r=new Restaurant();
		r.name="김천";
		r.table=10;
		r.starPoint=4.5;
		r.reservable=false;
		r.printInfo();
	
		String store="김천";
		int table=10;
		double starPoint=4.5;
		
			
	}

}
