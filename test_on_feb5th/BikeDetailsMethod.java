package com.xworkz.test_on_feb5th;

public class BikeDetailsMethod {
	public static void main(String[] args) {
	BikeDetails bikedetails[]=new BikeDetails[4];
	
	BikeDetails bikedetails1=new BikeDetails("yamaha","blue",2019,130000,45);
	BikeDetails bikedetails2=new BikeDetails("v3","red",2018,211000,43);
	BikeDetails bikedetails3=new BikeDetails("pulsar","black",2019,1650000,40);
	BikeDetails bikedetails4=new BikeDetails("enfield","black",2017,225000,40);
	
	bikedetails[0]=bikedetails1;
	bikedetails[1]=bikedetails2;
	bikedetails[2]=bikedetails3;
	bikedetails[3]=bikedetails4;
	
	for(int index=0;index<bikedetails.length;index++) {
		System.out.println(bikedetails[index].name + bikedetails[index].colour + bikedetails[index].yearModel + bikedetails[index].price + bikedetails[index].mileage  );
	}
	
	BikeDetailsOperation.update("pulsar","220f");
	}
}
