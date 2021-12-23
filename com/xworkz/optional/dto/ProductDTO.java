package com.xworkz.optional.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable{
	private Integer id;
	private  String name;
    private String type;
    private Integer price;
    private Integer quantity;
	public ProductDTO(Integer id, String name, String type, Integer price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			if(obj instanceof ProductDTO) {
				ProductDTO product=(ProductDTO)obj;
				if(this.getPrice().equals(product.getPrice())) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
		
}
	public synchronized Integer getId() {
		return id;
	}
	public synchronized void setId(Integer id) {
		this.id = id;
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized String getType() {
		return type;
	}
	public synchronized void setType(String type) {
		this.type = type;
	}
	public synchronized Integer getPrice() {
		return price;
	}
	public synchronized void setPrice(Integer price) {
		this.price = price;
	}
	public synchronized Integer getQuantity() {
		return quantity;
	}
	public synchronized void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
}