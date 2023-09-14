package com.ms.apr205ofp.soldesk;

public class Student {
	private int no;
	private String name;
	private int age;
	
	//com.회사.프로그램.주제
//	１）생성자를 protected

	protected Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printInfo() {
		System.out.println(no);
		System.out.println(name);
		System.out.println(age);
	}

}
