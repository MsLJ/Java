
public class OMain3 {
	public static void main(String[] args) {
		Computer c=new Computer();
		c.cpu="i7-1234";
		c.ram=16;
		c.hdd=500;
		c.show();
		//컴퓨터
		//CPU:17-1234
		//RAm:16
		//HDD:500
		//출력
		System.out.println("---------");
		Computer c2=new Computer();
		c2.cpu="i5-5234";
		c2.ram=8;
		c2.hdd=250;
		c2.show();
		//컴
		//cpu가 i5-5423
		//ram:8
		//hdd:250
		System.out.println("--------");
		//c를c3로도 부를수있게 객체는 참조형 주소값 같아짐
		//Computer c3=c;
		Computer c3=new Computer();
		c3.cpu="i7-1234";
		c3.ram=16;
		c3.hdd=500;
		c3.show();
		System.out.println("----------");
		
		//c3의 hdd를 1000으로
		c3.hdd=1000;
		c3.show();
		System.out.println("------");
		c.show();
		c=null;//null 참조형 변수가 아무것도 가리키지 않는 상태
		c3=null;
		//다 쓴 공간은 반환해야
		
				//RAM:재부팅하면 다 지워짐
				//OS가 RAM을 3공간으로 나눠서 관리
				//?
				//stack:프로그램 종료되면 자동 반환
				//		프로그램이 종료 안됐으면?
				//heap:개발자가 수동으로 반환해야
				
				//Garbage collection:자동 메모리 정리
				//			heap영역 자동정리
				//			 그 자동의 발동시점이 언제
				//			  그 번지를 가리키는 변수가 더 이상 없으면
		
		
	
		
	}
}
