package com.ms.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String addr = "jdbc:oracle:thin:@195.168.9.65:1521:xe";
			con = DriverManager.getConnection(addr, "ljh", "dlwnsgk0108");

			String sql = "select * from may08_gandantable ";
			// 총괄객체
			pstmt = con.prepareStatement(sql);

			// sql완성

			// 실행,결과처리
			// CUD:영향받은 데이터 수
//		int row=pstmt.executeUpdate();
			// R:데이터
			rs=pstmt.executeQuery();
			
			//rs.next() 끝까지 작동
			//		다음 데이터로
			//		갔는데 없으면 false
			while (rs.next()) {
				//rs.getxxx("필드명") : 지금 보고있는 데이터의 그 필드 값 꺼내기
				System.out.println(rs.getString("g_name"));
				System.out.println(rs.getInt("g_price"));
				System.out.println("----------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs.close();
			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}

		k.close();
	}

}
