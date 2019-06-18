package com.biz.inout.model;

public class InOutVO {

	private String InOut;
	private int InTotal;
	private int OutTotal;
	private String Name;
	private String price;
	private String volume;
	private String Date;
	
	
	
	
	public String getInOut() {
		return InOut;
	}
	public void setInOut(String inOut) {
		InOut = inOut;
	}
	public int getInTotal() {
		return InTotal;
	}
	public void setInTotal(int inTotal) {
		InTotal = inTotal;
	}
	public int getOutTotal() {
		return OutTotal;
	}
	public void setOutTotal(int outTotal) {
		OutTotal = outTotal;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "InOutVO [InOut=" + InOut + ", InTotal=" + InTotal + ", OutTotal=" + OutTotal + ", Name=" + Name
				+ ", price=" + price + ", volume=" + volume + ", Date=" + Date + "]";
	}
	

}
