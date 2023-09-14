package com.ms.may091.restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ljh.ms.db.manager.MsDBManafer;

public class RestaurantDAO {
	private int allResCount;
	int resperpage=2;
	
	private static final RestaurantDAO RDAO=new RestaurantDAO();
	
	private RestaurantDAO() {
		// TODO Auto-generated constructor stub
	}
	public static RestaurantDAO getRdao() {
		return RDAO;
	}
	public int getAllpageCount() {
		int pageCount=(int)Math.ceil(allResCount/(double)resperpage);
		System.out.println(pageCount);
		return pageCount;
		
	}
	public void getAllResCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");
			String sql = "select count(*) from may09_restaurant_ms ";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			rs.next();
			allResCount = (rs.getInt("count(*)"));
			System.out.println("처음:" + allResCount);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			MsDBManafer.close(con, pstmt, rs);

		}

	}
	
	
	
	
	
	
	
	public  ArrayList<Restaurant> rpr(int pageNo) {
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");
			int start=(pageNo-1)*resperpage+1;
			int end=pageNo*resperpage;
			
			String sql = "select* "
					+ "from( "
					+ "select rownum as rn r_name,r_birth,r_address "
					+ "from( "
					+ "select * "
					+ "from MAY09_RESTAURANT_MS "
					+ "order by r_name,r_birth "
					+ ") "
					+ ") "
					+ "where rn>=? and rn<=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs=pstmt.executeQuery();
		
			ArrayList<Restaurant>ress=new ArrayList<>();
			Restaurant r=null;
			while (rs.next()) {
				ress.add(new Restaurant(
						rs.getDate("r_birth"),
						rs.getString("r_name"),
						rs.getString("r_address"),
						null
						)
						);
				
				
			}
			return ress;
		}
		catch (Exception e) {
			
			return null;
		}finally {
			MsDBManafer.close(con, pstmt, rs);
			
		}
	
			
		} 

	
	public String reg(Restaurant res) {
		Connection con=null;
		PreparedStatement pstmt = null;
		try {
			//연결
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");
		
			// SQL(미완성)
			// 값 들어갈 자리에?(따옴표 다 빼고)
			// SQL자체에 있는;빼고
			String sql = "insert into may09_restaurant_ms "+ "values(?,?,to_date(?,'YYYYMMDD'))";
			
			// SQL완성,SQL을 서버로 전송,전송한거 원격실행,결과 받아오기하는 객체
			pstmt = con.prepareStatement(sql);
			
			//SQL완성(? 채우기)
			pstmt.setString(1, res.getName());//이 옆에 번호1은 ?에 들어가는1이다.
			pstmt.setString(2, res.getAddress());
			pstmt.setString(3, res.getBirthday2());
			
			//insert는 1되거나 exception둘 중에 하나 뿐인데
			//근데 그걸 자바가 아나
			if (pstmt.executeUpdate()==1) {
				allResCount++;
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


