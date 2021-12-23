package com.xworkz.optional.dto;

import java.io.Serializable;


public class HockeyDTO implements Serializable{
	private String teamName;
	private Integer wins;
	private Integer loses;
	private String place;
	public HockeyDTO(String teamName, Integer wins, Integer loses, String place) {
		super();
		this.teamName = teamName;
		this.wins = wins;
		this.loses = loses;
		this.place = place;
	}
	@Override
	public int hashCode() {
		
		
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
		if(obj instanceof HockeyDTO) {	
		
		HockeyDTO other = (HockeyDTO) obj;
		if (this.getTeamName().equals(other.getTeamName())) {
			System.out.println("Team name is "+getTeamName());
				return true;
		}else {
			return false;
		}
		
		}
		}
		return false;
	}
		
	public synchronized String getTeamName() {
		return teamName;
	}
	public synchronized void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public synchronized Integer getWins() {
		return wins;
	}
	public synchronized void setWins(Integer wins) {
		this.wins = wins;
	}
	public synchronized Integer getLoses() {
		return loses;
	}
	public synchronized void setLoses(Integer loses) {
		this.loses = loses;
	}
	public synchronized String getPlace() {
		return place;
	}
	public synchronized void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "HockeyDTO [teamName=" + teamName + ", wins=" + wins + ", loses=" + loses + ", place=" + place + "]";
	}
	
	
	}
