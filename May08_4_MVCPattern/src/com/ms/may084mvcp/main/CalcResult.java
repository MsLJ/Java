package com.ms.may084mvcp.main;


//JavaBean 
//DTO(Data Transfer/Temp Object)
//VO(Value Object)
//POJO(Plain Old Java Object)
public class CalcResult {
	private int hab;
	private int cha;
	private int gob;
	private int moks;
	public CalcResult() {
	}
	public CalcResult(int hab, int cha, int gob, int moks) {
		super();
		this.hab = hab;
		this.cha = cha;
		this.gob = gob;
		this.moks = moks;
	}
	public int getHab() {
		return hab;
	}
	public void setHab(int hab) {
		this.hab = hab;
	}
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
	public int getGob() {
		return gob;
	}
	public void setGob(int gob) {
		this.gob = gob;
	}
	public int getMoks() {
		return moks;
	}
	public void setMoks(int moks) {
		this.moks = moks;
	}
	

}
