//pen is a Product

//product:상위(super),부모 클래스
//pen:하위,자식 클래스
//상속관계 맺어준
//Product로 부터 상속받은 pen
public class Pen extends Product {
//product에 있는 멤버들 받아옴
	String color;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	

	public Pen(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}


	// product에 있는 printInfo메소드 물려받아왔는데
	// 이름/가격출력->아쉬움
	// 지금 추가딘 색깔도 출력됐으면
	// overriding: 물려받아온 메소드 재정의
	//		1)진짜 냅다 바꿀때가 많은지
	//		2)바꾼다기 보다는 기존 기능에 뭐 추가
	@Override
	public void printInfo() {
		//product에 있는 printInfo->이름/가격
		super.printInfo();
		System.out.println(color);
	}

}
//@xxx : annotation
//		xxx자리에 뭐 들어가냐에 따라 천차만별
//		원래는 사람이 직접~~해야하는데
//		annotation쓰면 자동으로 처리되는
//@override
//	바로 밑에 오버라이딩 메소드 
//	아닌거 들어오면 에러
//	없어도되는데
//	소스 가독성위해
//overloading vs overriding
//똑같은 이름       몰려받아온 메소드를 재정의