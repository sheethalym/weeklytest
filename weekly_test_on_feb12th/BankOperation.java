package com.xworkz.weekly_test_on_feb12th;

public class BankOperation {
	
	Bank array[]= new Bank[4];
	int index=0;
	
	public void add(Bank bank) {
		if(bank!=null) {
			array[index]= bank;
			index++;
			
		}
	}
	
	public void printAll() {
		for(int index=0;index<array.length;index++) {
			if(array[index]!=null) {
				System.out.println(array[index].getAll());
			}
		}
	}
	
	public String getByLocation(String locate) {
		for(int index=0;index<array.length;index++) {
			if(array[index]!=null) {
				if(locate.equals(array[index].getLocation())) {
					System.out.println(array[index].getAll());
				}
			}
		}
		return "getting details by location";
	}
	
	public String getByAddress(String addrs) {
		for(int index=0;index<array.length;index++) {
			if(array[index]!=null) {
				if(addrs.equals(array[index].getAddress())) {
					System.out.println(array[index].getAll());
				}
			}
		}
		return "getting details by address";
	}
	
	public String updateAddressByCustomers(String newaddr,String customer) {
		for(int index=0;index<array.length;index++) {
			if(array[index]!=null) {
				if(customer.equals(array[index].getCustomers())) {
					array[index].setAddress(newaddr);
					System.out.println(array[index].getAll()); 
				}
			}
		}
		return "getting details by address";
	}

}
