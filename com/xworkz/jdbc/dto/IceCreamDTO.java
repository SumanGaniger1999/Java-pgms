package com.xworkz.jdbc.dto;

public class IceCreamDTO {
	private int id;
	private String ice_flavour;
	private String ice_name;
	private double price;
	public IceCreamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IceCreamDTO(int id, String ice_flavour, String ice_name, double price) {
		super();
		this.id = id;
		this.ice_flavour = ice_flavour;
		this.ice_name = ice_name;
		this.price = price;
	}
	public synchronized int getId() {
		return id;
	}
	public synchronized String getIce_flavour() {
		return ice_flavour;
	}
	public synchronized String getIce_name() {
		return ice_name;
	}
	public synchronized double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "IceCreamDTO [id=" + id + ", ice_flavour=" + ice_flavour + ", ice_name=" + ice_name + ", price=" + price
				+ "]";
	}
	

}
