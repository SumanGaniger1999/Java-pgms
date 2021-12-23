package com.xworkz.optional.dto;


public class CompanyDTO {
	private Integer id;
	private String name;
	private String ceoName;
	private Double turnOver;
	public CompanyDTO(Integer id, String name, String ceoName, Double turnOver) {
		super();
		this.id = id;
		this.name = name;
		this.ceoName = ceoName;
		this.turnOver = turnOver;
	}
	
	public int hashCode() {
		return 0;
		
	}
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CompanyDTO) {
				CompanyDTO company= (CompanyDTO)obj;
				if(this.getCeoName().equals(company.getCeoName())) {
					System.out.println("Company ceoName"+getCeoName());
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
	public synchronized String getCeoName() {
		return ceoName;
	}
	public synchronized void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public synchronized Double getTurnOver() {
		return turnOver;
	}
	public synchronized void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}
	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", name=" + name + ", ceoName=" + ceoName + ", turnOver=" + turnOver + "]";
	}
	

}
