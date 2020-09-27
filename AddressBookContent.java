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
	public String getFirstName()
	{
		return firstName;
	}
	public String getLasttName()
	{
		return lastName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getCity()
	{
		return city;
	}
	public int getZip()
	{
		return zip;
	}
	public String getPhoneNumber()
	{
		return phNo;
	}
	public String getEmail()
	{
		return email;
	}
	public void setFirstName(String fname)
	{
		this.firstName = fname;
	}
	public void setLastName(String lname)
	{
		this.lastName = lname;
	}
	public void setAddress(String addr)
	{
		this.address = addr;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setZip(int zipc)
	{
		this.zip = zipc;
	}
	public void setPhoneNumber(String phn)
	{
		this.phNo = phn;
	}
	public void setEmail(String mail)
	{
		this.email = mail;
	}

}
