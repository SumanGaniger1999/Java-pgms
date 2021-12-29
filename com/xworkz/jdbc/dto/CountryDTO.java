package com.xworkz.jdbc.dto;

public class CountryDTO {
 private int id;
 private String  countryName;
 private int code;
 private String continent;
public CountryDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public CountryDTO(int id, String countryName, int code, String continent) {
	super();
	this.id = id;
	this.countryName = countryName;
	this.code = code;
	this.continent = continent;
}
public synchronized int getId() {
	return id;
}
public synchronized String getCountryName() {
	return countryName;
}
public synchronized int getCode() {
	return code;
}
public synchronized String getContinent() {
	return continent;
}
@Override
public String toString() {
	return "CountryDTO [id=" + id + ", countryName=" + countryName + ", code=" + code + ", continent=" + continent
			+ "]";
}
 
 
}
