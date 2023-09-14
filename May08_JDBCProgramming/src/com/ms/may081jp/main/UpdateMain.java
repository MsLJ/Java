package com.ms.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//이름:krtable
//가격:-500
//성공
public class UpdateMain {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@195.168.9.65:1521:xe";
			con=DriverManager.getConnection(addr, "ljh", "dlwnsgk0108");
			System.out.print("이름:");
			String n = k.next();
			System.out.print("가격:");
			int p = k.nextInt();
			//SQL(미완성)여기서 insert,update
			String sql = "update may08_gandantable "
					+ "set g_price=g_price+? "
					+ "where g_name=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, p);
			pstmt.setString(2, n);
			int row=pstmt.executeUpdate();
			if (row==1) {
				System.out.println("성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}

		k.close();
	}

}
