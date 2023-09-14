package com.ms.may091.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ljh.ms.db.manager.MsDBManafer;
//페이지 나누자->총 페이지 수 필요->총 데이터 갯수
//그 총 데이터 갯수는 처음 한번만 세어놓자
//데이터가 추가되면+1,삭제되면-1

//객체 만들 필요 없으면:static메소드 기반
//있으면
//	하나:singleton패턴
//	여러개
//		작정하고 자동화된 생성:factory패턴
//		평범
// 		DAO
//			:페이지 나누기 기능이 있게 되고
//			->전체 데이터수를 멤버변수로 저장하게 되고
//			->객체는 만들어야 하는데
//			->하나는 필요
//			->singleton패턴
public class MenuDAO {
	private int allMenuCount;
	int menuperpage=3;
	//2.내부에서 하나 만들어놓고
	private static final MenuDAO MDAO=new MenuDAO();
	
	//1.객체 외부에서 못만들게
	private MenuDAO() {
		// TODO Auto-generated constructor stub
	}
	//3.그 하나 만들어놓은거 외부에서 쓸 수 있게.
	public static MenuDAO getMdao() {
		return MDAO;
	}
	public int getAllPageCount() {
		//14 한페이지당 3개
		//14/3=4.?->올림
		//allMenuCount/menuPerPage:4
//		allMenuCount/(double)menuperpage:4.666
//		Math.ceil(allMenuCount/(double)menuperpage:4.666):5.0
//		(int)Math.ceil(allMenuCount/(double)menuperpage:4.666)
		//round는 반올림 ceil은 그냥올림
		int pageCount=(int)Math.ceil(allMenuCount/(double)menuperpage);
		System.out.println(pageCount);
		return pageCount;
		
	}
	

	public void getAllMenuCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");
			String sql = "select count(*) from may09_menu_ms ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			allMenuCount = (rs.getInt("count(*)"));// 전체 데이터 수
			System.out.println("처음:" + allMenuCount);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			MsDBManafer.close(con, pstmt, rs);

		}

	}
	
	
	
	

	public ArrayList<Menu> mpr(int pageNo) {
		Connection con = null;
		
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		try {
			//p1:1 2 3 
			//p2:4 5 6
			//p3:7 8 
			
			int start=(pageNo-1)*menuperpage+1;
			int end=pageNo*menuperpage;
			
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");

			// SQL(미완성)
			// 값 들어갈 자리에?(따옴표 다 빼고)
			// SQL자체에 있는;빼고
			String sql2 = "select* "
					+ "from( "
					+ "select rownum as rn,m_no,m_name,m_price,m_r_name "
					+ "from( "
					+ "select * "
					+ "from may09_menu_ms "
					+ "order by m_r_name,m_name "
					+ ") "
					+ ") "
					+ "where rn>=? and rn<=? ";

			// SQL완성,SQL을 서버로 전송,전송한거 원격실행,결과 받아오기하는 객체

			pstmt2 = con.prepareStatement(sql2);
			pstmt2.setInt(1, start);
			pstmt2.setInt(2, end);

			// SQL완성(? 채우기)
			;// pstmt.set자료형(번호,값);

			// insert는 1되거나 exception둘 중에 하나 뿐인데
			// 근데 그걸 자바가 아나
			rs = pstmt2.executeQuery();
			// ResultSet->ArrayList<자바빈>
			ArrayList<Menu> menus = new ArrayList<>();
			Menu m = null;
			// while문 넣기전에 그 값을 저장해줘야해서 만듬
			while (rs.next()) {
				m = new Menu();
				m.setNo(rs.getInt("m_no"));
				m.setName(rs.getString("m_name"));
				m.setRmname(rs.getString("m_r_name"));
				m.setPrice(rs.getInt("m_price"));
				menus.add(m);

			}
			return menus;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			MsDBManafer.close(con, pstmt2, rs);

		}

	}
//public int getAllPage() {
//	
//}

	public String reg(Menu m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 연결
			con = MsDBManafer.connect("jdbc:oracle:thin:@195.168.9.65:1521:xe", "ljh", "dlwnsgk0108");

			// SQL(미완성)
			// 값 들어갈 자리에?(따옴표 다 빼고)
			// SQL자체에 있는;빼고
			String sql = "insert into MAY09_menu_MS " + "values(may09_menu_ms_seq.nextval,?,?,?)";

			// SQL완성,SQL을 서버로 전송,전송한거 원격실행,결과 받아오기하는 객체
			pstmt = con.prepareStatement(sql);

			// SQL완성(? 채우기)
			;// pstmt.set자료형(번호,값);

			pstmt.setString(1, m.getName());
			pstmt.setInt(2, m.getPrice());
			pstmt.setString(3, m.getRmname());

			// insert는 1되거나 exception둘 중에 하나 뿐인데
			// 근데 그걸 자바가 아나
			if (pstmt.executeUpdate() == 1) {
				allMenuCount++;
				System.out.println("추가되고나면:" + allMenuCount);
				return "성공";
			}
			return null;// 실행은 안되는데 문법적으로 추가
		} catch (Exception e) {

			return "실패";
		} finally {
			MsDBManafer.close(con, pstmt, null);

		}

	}

}
