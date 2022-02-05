package com.xworkz.test_on_feb5th;

public class MyDetailsTester {

	public static void main(String[] args) {
		
		MyDeatils mydeatils=new MyDeatils();
		
		mydeatils.setByName("sheethal");
		String name=mydeatils.getByName();
		System.out.println(name);
		
		byte num=20;
		mydeatils.setById(num);
		byte id=mydeatils.getById();
		System.out.println(id);
		
		mydeatils.setByAge(23);
		int age=mydeatils.getByAge();
		System.out.println(age);
		
		mydeatils.setByYearOfBirth(1998);
		int yearOfBirth=mydeatils.getByYearOfBirth();
		System.out.println(yearOfBirth);
		
		mydeatils.setByHeight(177);
		int height=mydeatils.getByHeight();
		System.out.println(height);
		
		

	}

}
