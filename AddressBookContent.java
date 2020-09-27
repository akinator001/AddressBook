package com.capgemini.addressbook;

public class AddressBookContent {
	String firstName;
	String lastName;
	String address;
	String city;
	int zip;
	String phNo;
	String email;
	
	AddressBookContent(String firstName,String lastName,String address,String city,int zip,String phNo,String email){
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.address = address ;
		this.city = city ;
		this.zip = zip ;
		this.phNo = phNo ;
		this.email= email ;
	}
	
}
