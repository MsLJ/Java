package com.ms.may085daodtop.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import ljh.ms.db.manager.MsDBManafer;

//이름:
//	가격:
public class DAO_DTO_Main {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");

			// 데이터 확보
			System.out.print("이름:");
			String n = k.next();
			System.out.print("가격:");
			int p = k.nextInt();

			// SQL(미완성)
			// 값 들어갈 자리에?(따옴표 다 빼고)
			// SQL자체에 있는;빼고
			String sql = "insert into may08_gandantable values(?,?)";
			// SQL완성,SQL을 서버로 전송,전송한거 원격실행,결과 받아오기하는 객체
			pstmt = con.prepareStatement(sql);
			
			//SQL완성(? 채우기)
			pstmt.setString(1, n);//pstmt.set자료형(번호,값);
			pstmt.setInt(2, p);
			
			// 서버로 전송,실행,결과받기
			int row=pstmt.executeUpdate();
			if (row==1) {
				System.out.println("성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		MsDBManafer.close(con, pstmt, null);

		k.close();
	}
		}
		


