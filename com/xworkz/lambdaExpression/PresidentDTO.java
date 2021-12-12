package com.xworkz.lambdaExpression;

public class PresidentDTO {
	
	private String name;
	private String age;
	private String countryName;
	private String language;
	public PresidentDTO(String name, String age, String countryName, String language) {
		super();
		this.name = name;
		this.age = age;
		this.countryName = countryName;
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
