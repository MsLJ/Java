package com.ms.apr284ucc.student;

public class Student {
	private String name;
	private double math;
	private double eng;
	private double kor;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, double math, double eng, double kor) {
		super();
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(math);
		System.out.println(kor);
		System.out.println(eng);
	}

}
