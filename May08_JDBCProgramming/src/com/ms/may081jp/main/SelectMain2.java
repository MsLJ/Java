package com.ms.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectMain2 {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		
		try {
			String addr = "jdbc:oracle:thin:@195.168.9.65:1521:xe";
			con = DriverManager.getConnection(addr, "ljh", "dlwnsgk0108");
			System.out.print("이름:");
			String n = k.next();
			String sql = "select avg(g_price) "
					+ "from may08_gandantable "
					+ "where g_name like '%'||?||'%' ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, n);
			rs=pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getDouble("avg(g_price)"));
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {rs.close();} catch (Exception e) {}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}

		k.close();
	}

}
