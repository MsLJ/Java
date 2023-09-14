import java.util.Scanner;

//비만도 검사(키에 m단위쓰면 곤란...)
//공부방법:
//	1)저게 뭔데 강사가 저기다 저렇게 써놨나: 파악
//	2)지우고 다시(외워서x,1번의 판단을 본인이 해보는걸로)
//	3)뭘 추가
// 	=>영타연습
public class FMain4 {
	// 결과 나올게 없어서 :void
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름:");
		return k.next();
	}

	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키(cm):");
		double height = k.nextDouble();
		return (height < 3) ? getHeight() : height;

	}

	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("체중(kg):");
		return k.nextDouble();
	}

	public static double clacStdWeight(double height) {
		return (height - 100) * 0.9;

	}

	public static double calcBimando(double weight, double stdWeight) {
		return (weight / stdWeight) * 100;
	}

	public static String judge(double bimando) {
		return (bimando > 120) ? "비만" : "정상";
	}

	public static void printResult(double stdWeight, double bimando, String name, String result) {
		System.out.printf("표준체중:%.1fkg\n", stdWeight);
		System.out.printf("비만도:%.1%%\n", bimando);
		System.out.printf("%s씨는 %s\n", name, result);
	}

	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double stdWeight = clacStdWeight(height);
		double bimando = calcBimando(weight, stdWeight);
		String result = judge(bimando);
		printResult(stdWeight, bimando, name, result);

	}
}

//언어

//조건문
//반복문
//배열(컬렉션)
//----------->정보올림피아드
//그 언어의 특징