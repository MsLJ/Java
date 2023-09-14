//조건문
//	if-else if - else:주력
//	switch - case:권한부여 상황에 유리

//switch-case가 언제 유리한지 설명

//DBA(Admin):관리자
//		전원관리
//		백업/복구
//		계정관리
//		CRUD(데이터를 CreatrReadUpdateDelete)
//		서비스 활용

//DBP(Programmer):연동된 프로그램 만드는 개발자
//		CRUD
//		서비스 활용
//DBU(User):DB가 뭔지는모르는데, 쓰고있는사람
//		서비스 활용

public class CSMain6 {
	public static void main(String[] args) {

		String role = "DBA";
		switch (role) {
		case "DBA":
			System.out.println("계정관리");
			System.out.println("백업/복구");
			System.out.println("전원관리");
		case "DBP":
			System.out.println("CRUD");

		default:
			System.out.println("서비스 활용");
			break;
		}

		System.out.println("---------------");
		String grade = "상병";
		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		default:
			System.out.println("잠");
		}

	}

}
