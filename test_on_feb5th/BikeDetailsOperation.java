package com.xworkz.test_on_feb5th;

public class BikeDetailsOperation {
	BikeDetailsMethod bikedetailsmethod=new BikeDetailsMethod();
	static BikeDetails bikedetails[]=new BikeDetails[4];
	
	static void update(String newName,String oldName) {
		for(int index =0;index<bikedetails.length;index++) {
			if(bikedetails!=null) {
			if(oldName.equals(bikedetails[index].colour)) {
					bikedetails[index].name= newName;
				}
			}
		}
	}

}
