package com.xworkz.train.dto;

public class TrainDTO {

	private int tid;
	private int trainNo;
	private String boarding;
	private String destination;
	private int seatNO;
	private int price;
	private String cls;
	private String name;
	public TrainDTO() {
		
		// TODO Auto-generated constructor stub
	}
	public TrainDTO(int tid, int trainNo, String boarding, String destination, int seatNO, int price, String cls,
			String name) {
		super();
		this.tid = tid;
		this.trainNo = trainNo;
		this.boarding = boarding;
		this.destination = destination;
		this.seatNO = seatNO;
		this.price = price;
		this.cls = cls;
		this.name = name;
	}
	public synchronized int getTid() {
		return tid;
	}
	public synchronized int getTrainNo() {
		return trainNo;
	}
	public synchronized String getBoarding() {
		return boarding;
	}
	public synchronized void setTid(int tid) {
		this.tid = tid;
	}
	public synchronized void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public synchronized void setBoarding(String boarding) {
		this.boarding = boarding;
	}
	public synchronized void setDestination(String destination) {
		this.destination = destination;
	}
	public synchronized void setSeatNO(int seatNO) {
		this.seatNO = seatNO;
	}
	public synchronized void setPrice(int price) {
		this.price = price;
	}
	public synchronized void setCls(String cls) {
		this.cls = cls;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized String getDestination() {
		return destination;
	}
	public synchronized int getSeatNO() {
		return seatNO;
	}
	public synchronized int getPrice() {
		return price;
	}
	public synchronized String getCls() {
		return cls;
	}
	public synchronized String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "TrainDTO [tid=" + tid + ", trainNo=" + trainNo + ", boarding=" + boarding + ", destination="
				+ destination + ", seatNO=" + seatNO + ", price=" + price + ", cls=" + cls + ", name=" + name + "]";
	}
	
}
