package edu.kh.poly.pack1.model.dto;

public class SmartPhone {
	private String display;
	private String newsAgency;
	private String ap;	//스마트폰 cpu]
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String display, String newsAgency, String ap) {
		super();
		this.display = display;
		this.newsAgency = newsAgency;
		this.ap = ap;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getNewsAgency() {
		return newsAgency;
	}

	public void setNewsAgency(String newsAgency) {
		this.newsAgency = newsAgency;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	@Override
	public String toString() {
		return "SmartPhone [display=" + display + ", newsAgency=" + newsAgency + ", ap=" + ap + "]";
	}

}
