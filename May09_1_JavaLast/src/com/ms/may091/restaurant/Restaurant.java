package com.ms.may091.restaurant;

import java.util.Date;

public class Restaurant {
	private Date birthday;
	private String name;
	private String address;
	private String birthday2;
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	public Restaurant(Date birthday, String name, String address, String birthday2) {
		super();
		this.birthday = birthday;
		this.name = name;
		this.address = address;
		this.birthday2 = birthday2;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday2() {
		return birthday2;
	}
	public void setBirthday2(String birthday2) {
		this.birthday2 = birthday2;
	}
	
	

}
