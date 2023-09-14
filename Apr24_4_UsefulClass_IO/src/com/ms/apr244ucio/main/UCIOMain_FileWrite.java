package com.ms.apr244ucio.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class UCIOMain_FileWrite {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.print("뭐:");
		String s=k.next();
		System.out.println("---------");
		System.out.println(s);
		
		//파일에 쓰기 편하게 OutputstreamWriter개조해 놓은
		//파일은 없으면 만둘어 줌 폴더는x
		//Windows:\
		//Linux:/
		//Windows에서도 리눅스처럼/써도 인식함
		
		//\r:커서 맨 앞으로
		//\n:줄만 바꾸기
		//콘솔창은 간편하게 쓰라고
		
		//빨대시스템은 다 썼으면 빨리 치워야
		//그래야 다른프로그램에서 빨대를 쓸 수가
		//fw위에 덮어씌워놓은 bw 연관된것 중에는 하나만 닫으면 다 처리됌.
//			FileWriter fw=new FileWriter("C:\\lee\\work space\\Java  수업/apr24.txt",true);//append로 쓸꺼면 뒤에true
		BufferedWriter bw=null;
		try {
			//OutputStreamWriter개조형(2bytes)
			FileOutputStream fos=new FileOutputStream("C:\\lee\\work space\\Java  수업/apr24.txt",true);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
			bw=new BufferedWriter(osw);
			bw.write(s+"\r\n");
		
			bw.flush();//빨대 용량 꽉 안차도 강제전송
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
