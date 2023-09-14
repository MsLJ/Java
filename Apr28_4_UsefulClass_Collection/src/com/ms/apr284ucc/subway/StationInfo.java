package com.ms.apr284ucc.subway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StationInfo {
	private Date day;
	private String hosun;
	private String stationname;
	private int ipeople;
	private int alight;
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd(E)");
	
	public StationInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public StationInfo(String line) throws ParseException {
		String[]line2=line.split(",");
		//day (String을 Date로)
		String day2=line2[0]+line2[1]+line2[2];
		//String day2=line[4];내가 만든 자료는 4에 2015MMdd로 돼있음
		day=sdf.parse(day2);
		
		hosun=line2[4];
		stationname=line2[5];
		//ipeople(String을 int로)
		ipeople=Integer.parseInt(line2[6]);
		//alight
		alight=Integer.parseInt(line2[7]);
	}
	


	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getHosun() {
		return hosun;
	}

	public void setHosun(String hosun) {
		this.hosun = hosun;
	}

	public String getStationname() {
		return stationname;
	}

	public void setStationname(String stationname) {
		this.stationname = stationname;
	}

	public int getIpeople() {
		return ipeople;
	}

	public void setIpeople(int ipeople) {
		this.ipeople = ipeople;
	}

	public int getAlight() {
		return alight;
	}

	public void setAlight(int alight) {
		this.alight = alight;
	}

	public void printInfo() {
		System.out.println(sdf2.format(day));
		System.out.println(hosun);
		System.out.println(stationname);
		System.out.println(ipeople);
		System.out.println(alight);
		System.out.println("------");
	}

}