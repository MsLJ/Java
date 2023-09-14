package com.ms.apr244ucio.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//encoding
//인코딩방식이 여러종류
//ㅋ->encoding->10110->decoding->ㅋ
//ㅋ-A->11111->A->ㅋ
//ㅋ-B->01011-B->ㅋ
//ㅋ-C->00001-A->깨짐

//한글/날짜

//빅데이터
//	기상청에서 데이터 받아왔는데:A
//	내가 원복시킬때:c

//전세계적으로 가장 많이 :utf-8
//국내 랭킹 2위:euc-kr
//표준을 안지키는 회사:MS,Apple

//확장자:윈도우 진영에만 있는 허상
//		뭔지 알기 편할뿐

//	.txt:메모장에서 열면 잘 열리는파일
//	.hwp:한글에서 열면 잘 열리는파일
//	.xls:엑셀에서 열면 잘 열리는파일

//.csv(comma separated value):
//	각 값들이 ,로 구분된 파일
//	그렇게 규칙적이니 엑셀에서 잘 여는데
//		엑셀이 utf-8깨버림
//		리눅스 서버에서 csv를 불러다가 분석

public class UCIOMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("이름:");
		String name = k.next();
		System.out.print("생일(yyyyMMdd):");
		String birth = k.next();
		System.out.print("국어:");
		int guka = k.nextInt();
		System.out.print("영어:");
		int english = k.nextInt();
		System.out.print("수학:");
		int math = k.nextInt();
		//win:경로에 대소문자 구별x
		//linux:경로에 구별o
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream("C:\\lee\\work space\\Java  수업\\student.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			String data=String.format("%s,%s,%d,%d,%d\r\n", name,birth,guka,english,math);
			bw.write(data);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
