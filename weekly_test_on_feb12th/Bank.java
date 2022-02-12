package com.xworkz.weekly_test_on_feb12th;

public class Bank {
	private String name;
	private String location;
	private String customers;
	private int noOfCustomers;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		customers = customers;
	}
	public int getNoOfCustomers() {
		return noOfCustomers;
	}
	public void setNoOfCustomers(int noOfCustomers) {
		this.noOfCustomers = noOfCustomers;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAll() {
		System.out.println(name+"\t"+location+"\t"+customers+"\t"+noOfCustomers+"\t"+address);
		return "getAll";
	}
	

}
