//part1:pp
//part2:OOP
//  2-1:OOP핵심
//	2-2:객체간의 관계
//	2-3:Java만 해당하는 OOP얘기
//part3:이 과정을 진행하는데 유용할만한 내장 기능 소개
//-------------------------------------------

public class OMain {
	public static void main(String[] args) {
		// 객체만들기
		// 클래스명 변수명=new생성자;

		Pen p = new Pen();
		p.name = "모나미153";
		p.color = "검정";
		p.price = 300;

		p.print();
		System.out.println("-------");

		Snack s = new Snack("맛동산", 6500, "해테");
		s.print();
		System.out.println("--------");

		Snack s2 = new Snack();

		Weather w = new Weather(27, 20);
		w.print();

		System.out.println("------");

		// 이름이 홍길동,나이가 30살인 사람
		// 출력

		Human h = new Human(30, "홍길동");
		h.print();

	}

}
