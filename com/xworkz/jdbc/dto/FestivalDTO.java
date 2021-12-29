package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class FestivalDTO implements Serializable{
	private int festivalId;
	private String festivalName;
	private String  festivalDate;
	private String festivalState;
	public FestivalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FestivalDTO(int festivalId, String festivalName, String festivalDate, String festivalState) {
		super();
		this.festivalId = festivalId;
		this.festivalName = festivalName;
		this.festivalDate = festivalDate;
		this.festivalState = festivalState;
	}
	public synchronized int getFestivalId() {
		return festivalId;
	}
	public synchronized String getFestivalName() {
		return festivalName;
	}
	public synchronized String getFestivalDate() {
		return festivalDate;
	}
	public synchronized String getFestivalState() {
		return festivalState;
	}
	@Override
	public String toString() {
		return "FestivalDTO [festivalId=" + festivalId + ", festivalName=" + festivalName + ", festivalDate="
				+ festivalDate + ", festivalState=" + festivalState + "]";
	}
	
	

}
