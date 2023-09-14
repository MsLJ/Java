package com.ms.may081jp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//이름:
//삭제성공
public class DeleteMain {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		Connection con=null;
		
		
		PreparedStatement pstmt=null;
		try {
			String addr = "jdbc:oracle:thin:@195.168.9.65:1521:xe";
			con = DriverManager.getConnection(addr, "ljh", "dlwnsgk0108");
			System.out.print("이름:");
			String n = k.next();
			
			//Java에서 %가.. %d %s %f like %?%쓰고싶다면
			//'%'||?||'%' 이런식으로 %앞에'로 감싸고 뒤에 ||쓰기
			String sql = "delete from may08_gandantable "
					+ "where g_name like '%'||?||'%' ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, n);
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
