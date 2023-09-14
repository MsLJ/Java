package com.ms.may091.javalastmain;

import java.util.ArrayList;

import com.ms.may091.menu.Menu;
import com.ms.may091.menu.MenuDAO;
import com.ms.may091.restaurant.Restaurant;
import com.ms.may091.restaurant.RestaurantDAO;
//웹사이트: 동시에 여러명이
//  DB계정 하나를 같이 쓰게 되는거
//	계정 하나당 동시에 접속할 수 있는 있는 수 제한되어있고
//	=>작업 하나 해야할 때마다 연결해서 처리하고 바로 끊어야
// EclipseIDE가 자동commit 가끔 안되는 버그가 나면 commit
// 여태했던 작업 DB서버 실제 반영==commit
// 여태했던거 취소 ==rollback


//java.util.Date:일반
//java.sql.Date:DB작업때는
// 1)MyBatis에서 java.util.Date씀
// 2)java.util.Date<->java.sql.Date자동 변환

//	Java->JSP->SPring
//	JDBC->ConnectionPool->MyBatis

//객체 만들 필요 없으면:static메소드 기반
//있으면
//	하나:singleton패턴
//	여러개
//		작정하고 자동화된 생성:factory패턴
//		평범
//
public class HomeController {
	public static void main(String[] args) {
		ConsoleScr cs=new ConsoleScr();
		Restaurant res=null;
		Menu mn=null;
		String result=null;
		int menu=0;
		ArrayList<Menu>menus=null;
		ArrayList<Restaurant>ress=null;
		MenuDAO.getMdao().getAllMenuCount();
		RestaurantDAO.getRdao().getAllResCount();
		int pageCount=0;
		int pageNo=0;
		
		while (true) {
			menu=cs.showMainMenu();
			if (menu==10) {
				break;
				
			}else if(menu==1) {
				res=cs.showRegRestaurantInfo();
				result=RestaurantDAO.getRdao().reg(res);
				cs.print(result);
				
			}else if(menu==2) {
				//식당명 보여주기
				pageCount=RestaurantDAO.getRdao().getAllpageCount();
				pageNo=cs.showGetPageNoRes(pageCount);
				ress=RestaurantDAO.getRdao().rpr(pageNo);
				cs.printRestaurant(ress);
				//식당명 이름보고 메뉴넣기
				mn=cs.showRegMenuInfo();
				result=MenuDAO.getMdao().reg(mn);
				cs.print(result);
			}else if(menu==3) {
				pageCount=RestaurantDAO.getRdao().getAllpageCount();
				pageNo=cs.showGetPageNoRes(pageCount);
				ress=RestaurantDAO.getRdao().rpr(pageNo);
				cs.printRestaurant(ress);
				
			
				
			}else if(menu==4) {
				//메뉴조회
				pageCount=MenuDAO.getMdao().getAllPageCount();
				pageNo=cs.showGetPageNoMenu(pageCount);
				menus=MenuDAO.getMdao().mpr(pageNo);
				cs.printMenus(menus);
				
			
		}
		
		
		//페이지[1~5]
			//한 페이지당 3개씩 나오게 한다치면 총 페이지 수?
//			전체 메뉴 갯수
			
		
		
		
		
	}
		cs.bye();

}
}
