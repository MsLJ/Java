import java.util.Scanner;

//한국어로 설계-번역(개발)->	.java
//.java	-번역(compile)->	.class
//.class	-압축->	.jar(Java ARchive)

//실행:cmd가서
//	java -jar 파일명
// 의사 
// 사람 정보 넣으면 비만검사 (이름,키,몸무게)

//비만도가 120초과하면 비만
//비만도=(몸무게/표중체준)*100
//표준체중=(키-100)*0.9

//값들 소수점 이하 1자리 반올림

public class OMain4 {
	public static void main(String[] args) {

		// 키보드 입력받을 준비
		// 이름 입력받기
		Scanner k = new Scanner(System.in);

		System.out.print("이름:");
		String name = k.next();

		System.out.print("키:");
		double height = k.nextDouble();

		System.out.print("몸무게:");
		double weight = k.nextDouble();

		System.out.println("---------");

		double stdweight = (height - 100) * 0.9;
		double bimando = (weight / stdweight) * 100;

		String result = (bimando > 120) ? "비만" : "정상";

		System.out.printf("표준체중:%.1fkg\n", stdweight);
		System.out.printf("비만도:%.1f%%\n", bimando);
		System.out.printf("%s씨는 %s\n", name, result);

		System.out.print("종료하려면 뭐라도 써:");
		String s = k.next();

	}

}
