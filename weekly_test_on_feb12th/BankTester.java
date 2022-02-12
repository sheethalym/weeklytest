package com.xworkz.weekly_test_on_feb12th;

public class BankTester {

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.setName("axis_bank");
		bank.setLocation("bangalore");
		bank.setCustomers("sheethal");
		bank.setNoOfCustomers(100);
		bank.setAddress("no123");
		
		Bank bank2 = new Bank();
		bank2.setName("SBI");
		bank2.setLocation("chennai");
		bank2.setCustomers("naveen");
		bank2.setNoOfCustomers(50);
		bank2.setAddress("no 12");
		
		Bank bank3 = new Bank();
		bank3.setName("central_bank");
		bank3.setLocation("goa");
		bank3.setCustomers("hemu");
		bank3.setNoOfCustomers(70);
		bank3.setAddress("no 20");
		
		BankOperation operation = new BankOperation();
		operation.add(bank);
		operation.add(bank2);
		operation.add(bank3);
		operation.printAll();
		
		System.out.println("===========gettingbybank location============");
		String a = operation.getByLocation("bangalore");
		System.out.println(a);
		System.out.println("===========gettingbybank location============");
		String b = operation.getByAddress("no 20");
		System.out.println(b);
		System.out.println("===========updatingaddressby customers============");
		String c = operation.updateAddressByCustomers("no 19","hemu");
		System.out.println(c);
		

	}

}
