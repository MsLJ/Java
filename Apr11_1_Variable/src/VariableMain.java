//CPU- 연산장치 ->계산이 빨라지는->컴 속도
//RAM- 저장장치->저장 많이->용량
//		변수형태로 임시저장
//SSD/HDD-저장장치->저장 많이->용량
//		파일형태로 영구저장
//GPU- 그래픽 처리용(CPU+RAM+HDD)
//-----------------------------------------

//변수(Variable):
//		데이터 담는 그릇
//		프로그램 쓰다보면 데이터가 생길텐데 
//		임시저장할 때-변수
//		영구저장할 때-파일로 저장->DB
//
//		문법
//		  자료형 변수명;<= 변수 선언(만들기)
//		  변수명=값;<= 변수에 값 대입
//----------------------------------
//		=:대입연산자
//		 우항에 있는거 좌항에 넣어라
//-------------------------------------
//RAm을 OS(Windows/Linux)가
//			?
//			stack: 아래쪽에서부터 차곡차곡 공간을 배정함
//			heap : 적당한곳 골라서 배정

// ML/DL:엣날에나왔는데
//	요즘 4차산업이라고 난리
//  옛날 컴사양이 낮아서 실제로 돌리지 못하는

//		데이터 특징을 파악해서
//		적절한 사이즈의 자료형 고르는 능력 필요
//		근데 요즘 컴 좋음

//	알고리즘의 시대:컴 사양이 낮으니
//		어떻게 하면 조금이라도 아낄까
//		최적의 알고리즘을 찾고,변수덜쓸까 궁리

//		유지보수의 시대: 컴 워낙 좋아져서
//					아껴봐야..
// 					프로그램 유지보수하기 좋게 만들자
//					=>spring

//		  자료형 :그릇종류(데이터랑 안맞으면 에러)
//				=>데이터에 맞는 자료형을 찾는 능력
//		기본형:stack영역에 데이터를 저장
//		  정수(소수점 없는 숫자):byte(1byte),short(2),int(4),long(8)
//						   기본으로 int(-21억~21억)
//						   21억 넘는 데이터 long
//		  실수(소수점 있는 숫자):float(4),double(8)
//		  한글자:char
//		  여러글자:string
//		  논리형:boolean
//		  자리만 차지:void
//		참조형:heap에 데이터,stack에 있는 변수에는 heap번지를
//			여러글자:string(되게 큼)
	//		...

//		기본자료형:아무 처리도 안하고 값만 있을떄 뭘로 인식하나
//        10  -> int
//		 12.1 -> double(대부분의 다른 언어는float)

//		  변수명
//			마음대로
//			규칙
//			 숫자로 시작x
//			 특수문자는_ $정도만 사용가능
//			 문법x
//			문화
//			 뜻 통하게=>낙타체/뱀체
//			 소문자로 시작
//			 한글x

//나이 많은 _로시작 기술
public class VariableMain {
	public static void main(String[] args) {
		// 사람 나이가 30 =>잠깐 저장했다가 버리자
		// int age;// 변수 만들기
		// age = 30;// 값 넣기
		int age = 30;// 변수 만들기+값 넣기
		System.out.println(age);

		// 사람 시력이 1.0
		double eye = 1.0;
		// float eye = (float) 1.0;
		System.out.println(eye);
		
		//컴:전자제품->전기가 흐르고 말고
		//모르스부호
		
		// 글자 똥
		char ddong = '똥';
		System.out.println(ddong);
		
		// 여러 글자ㅋㅋ
		String laugh = "ㅋㅋ";
		System.out.println(laugh);
		
		//비가 오나
		boolean isRaining=true;//false
		System.out.println(isRaining);
	}
}
