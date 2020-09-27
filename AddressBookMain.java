package com.capgemini.addressbook;

import java.util.*;
public class AddressBookMain {
	public static void main(String []args) {
		
		System.out.println("welcome to Address Book \r\n"+ 
							"Program \r\n"+
							 "AddressBookMain class on Master Branch" );
		ArrayList<AddressBookContent> list = new ArrayList<>();
		list.add(new AddressBookContent("Aakash","Gandhi","Model Town","Panipat",132103,"8708155286","aakash.g@gmail.com" ));
		System.out.println("Contact created !!!");
	}
}
