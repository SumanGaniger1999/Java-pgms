package com.xworkz.jdbc.dto;

public class StateDTO {
private int id;
private String name;
private int code;
private String capital;
public StateDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public StateDTO(int id, String name, int code, String capital) {
	super();
	this.id = id;
	this.name = name;
	this.code = code;
	this.capital = capital;
}
@Override
public String toString() {
	return "StateDTO [id=" + id + ", name=" + name + ", code=" + code + ", capital=" + capital + "]";
}
public synchronized int getId() {
	return id;
}
public synchronized String getName() {
	return name;
}
public synchronized int getCode() {
	return code;
}
public synchronized String getCapital() {
	return capital;
}

}
