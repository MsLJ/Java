package com.ms.may085daodtop.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import ljh.ms.db.manager.MsDBManafer;

//MVC패턴
// DB에 연관된 작업을 하는 M을 DAO라고 부름
// Data Access Object

//try-catch는 사수가 담당할 c쪽에 있는게 맞는데
// 1)MVC패턴 ->M의 결과가 V까지 가야
// 2)DB안되면 어차피 아무것도 안되는거->대응방법이 어쩌고?
public class GiftDao {
	public static String reg(Gift g) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//연결
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");
			// SQL(미완성)
			// 값 들어갈 자리에?(따옴표 다 빼고)
			// SQL자체에 있는;빼고
			String sql = "insert into may08_gandantable values(?,?)";
			// SQL완성,SQL을 서버로 전송,전송한거 원격실행,결과 받아오기하는 객체
			pstmt = con.prepareStatement(sql);
			
			//SQL완성(? 채우기)
			pstmt.setString(1, g.getName());//pstmt.set자료형(번호,값);
			pstmt.setInt(2, g.getPrice());
			//insert는 1되거나 exception둘 중에 하나 뿐인데
			//근데 그걸 자바가 아나
			if (pstmt.executeUpdate()==1) {
				return "성공";
			}
			return null;//실행은 안되는데 문법적으로 추가
		}
		catch (Exception e) {
			
			return "실패";
		}finally {
			MsDBManafer.close(con, pstmt, null);
			
		}
			
		} 

	}
	


