package com.ms.apr243ucd.main;

import java.util.StringTokenizer;

//수정이 불가능한 문자열 객체->String
public class UCDMain_String {
	public static void main(String[] args) {
//		String s = new String("ㅋ");
		String s = "좀 다르게 씁시다 z말고";
		// OOP:실생활
		System.out.println(s.startsWith("z"));
		System.out.println(s.startsWith("o"));
		// s가 z로 시작하는지

		// s가 몇글자인지?
		System.out.println(s.length());

		// 3번째 글자
		System.out.println(s.charAt(2));

		// Z는 몇번째에
		System.out.println(s.indexOf("z"));

		// 말고->도 좋고
		System.out.println(s.replace("말고", "도 좋고"));
		
		//3번째~6번째까지
		System.out.println(s.substring(2, 6));
		//문자열 객체를 만들면서 %d쓰려면
		String s2=String.format("%.1f", 1123.1231231);
				System.out.println(s2);
				System.out.println("---------");
				
				//문자열 붙이기->x
				String s3="zzz";
				s3=s3.concat("ㅎㅎㅎ");
				s3+="ㅋㅋㅋ";
				System.out.println(s3);
				
				//문자열 대량으로 붙이기
				//String은 수정하면 계속해서 힙 영역에 새로운 주소값 생성후 Garbage collection에 의해 힙영역에 있는기존 은 다시 지워짐
				//StringBuffer는 힙 영역에 주소값 다시 만들지않고 기존에 있는 주소값 뒤에 더하는형식
				StringBuffer sb= new StringBuffer();
				sb.append("ㅋㅋㅋ");
				sb.append("ㅎ");
				sb.append("ㄷ");
				String s4=sb.toString();
				System.out.println(s4);
				//문자열 분리하기
				//데이터 받아오면 String 한덩어리
				//정형데이터:1번위치에 기온
				String s5="맑음,20.0,15.3";
				String []s55=s5.split(",");//정형데이터에 유리
				System.out.println(s55[0]);
				
				//비정형데이터:2번 위치가 뭐....
				String s6="조조가 밥을 먹어요";
				StringTokenizer st=new StringTokenizer(s6," ");
//				System.out.println(st.nextToken());
//				System.out.println(st.nextToken());
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					
				}
	}

}
