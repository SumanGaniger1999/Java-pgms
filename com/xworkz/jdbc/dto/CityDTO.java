package com.xworkz.jdbc.dto;

public class CityDTO {
private int id;
private String name;
private long population;
public CityDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public CityDTO(int id, String name, long population) {
	super();
	this.id = id;
	this.name = name;
	this.population = population;
}
public synchronized int getId() {
	return id;
}
public synchronized String getName() {
	return name;
}
public synchronized long getPopulation() {
	return population;
}
@Override
public String toString() {
	return "CityDTO [id=" + id + ", name=" + name + ", population=" + population + "]";
}

}
