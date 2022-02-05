package com.xworkz.test_on_feb5th;

public class MyDeatils {
	private String name;
	private byte id;
	private int age;
	private int yearOfBirth;
	private int height;
	
	public MyDeatils() {
		
	}
	
	void setByName(String name) {
		this.name=name;
	}
	
	String getByName() {
		return name;
	}
	
	void setById(byte id) {
		this.id=id;
	}
	
	byte getById() {
		return id;
	}
	
	void setByAge(int age) {
		this.age=age;
	}
	
	int getByAge() {
		return age;
	}
	
	void setByYearOfBirth(int yearOfBirth) {
		this.yearOfBirth=yearOfBirth;
	}
	
	int getByYearOfBirth() {
		return yearOfBirth;
	}
	
	void setByHeight(int height) {
		this.height=height;
	}
	
	int getByHeight() {
		return height;
	}

}
