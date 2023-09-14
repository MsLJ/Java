package com.ms.may091.javalastmain;

import java.nio.file.spi.FileSystemProvider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//v
//	웹디자이너의 html
import java.util.Scanner;

import com.ms.may091.menu.Menu;
import com.ms.may091.restaurant.Restaurant;

public class ConsoleScr {
	private Scanner inputSystem;
	public ConsoleScr() {
		inputSystem=new Scanner(System.in);
	}

	public int showMainMenu() {
		System.out.println("1)식당등록");
		System.out.println("2)메뉴등록");
		System.out.println("3)식당조회");
		System.out.println("4)메뉴조회");
		
		System.out.println("10)종료");
		System.out.println("-------");
		System.out.println("뭐:");
		return inputSystem.nextInt();
	}
	

	
	
	
	
	
	public Restaurant showRegRestaurantInfo() {
		System.out.print("이름:");
		String n=inputSystem.next();
		
		System.out.print("주소:");
		String add=inputSystem.next();
		
		
		System.out.print("설립날짜:");
		String birth=inputSystem.next();
		return new Restaurant(null,n,add,birth);
		
	}
	public Menu showRegMenuInfo() {
		System.out.print("이름:");
		String n=inputSystem.next();
		System.out.print("가격:");
		int p=inputSystem.nextInt();
		System.out.println("메뉴만든가게이름:");
		String rmn=inputSystem.next();
		return new Menu(0,n,p,rmn);
	}
	//Designer
	public int showGetPageNoMenu(int pageNo) {
		System.out.println("페이지:1~"+pageNo+"):");
		return inputSystem.nextInt();
	}
	public int showGetPageNoRes(int pageNo) {
		System.out.println("페이지:1~"+pageNo+"):");
		return inputSystem.nextInt();
	}
	public void print(String result) {
		System.out.println(result);
	}
	public void printMenus(ArrayList<Menu>menus) {
		for (Menu menu : menus) {
			System.out.println(menu.getNo());
			System.out.println(menu.getName());
			System.out.println(menu.getPrice());
			System.out.println(menu.getRmname());
			//여기서 그냥 menus출력한다라고하면 그 안에있는 데이터 값을 출력해주는게 아닌
			//그 데이터 값이 들어가있는 주소값을 출력...
			//ex:우편함에 있는 편지 편지를 봐야하는데 우편함을 본다와 같다
		}
	}
	public void printRestaurant(ArrayList<Restaurant>ress) {
		for (Restaurant restaurant : ress) {
			System.out.println(restaurant.getBirthday());
			System.out.println(restaurant.getAddress());
			System.out.println(restaurant.getName());
		}
	}
	
	public void bye() {
		inputSystem.close();
	}
}
