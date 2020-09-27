package com.capgemini.addressbook;

import java.util.*;
public class AddressBookMain {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome to Address Book \r\n"+ 
							"Program \r\n"+
							 "AddressBookMain class on Master Branch" );
		ArrayList<AddressBookContent> list = new ArrayList<>();
		
		System.out.println("Enter first name");
		String fname = sc.next();
		System.out.println("Enter last name");
		String lname = sc.next();
		System.out.println("Enter Address");
		String add = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter City");
		String city = sc.next();
		sc.nextLine();
		System.out.println("Enter zip code");
		int zipcode = sc.nextInt();
		System.out.println("Enter Phone Number");
		String ph = sc.next();
		System.out.println("Enter E-Mail");
		String mail = sc.next();

		list.add(new AddressBookContent("Aakash","Gandhi","Model Town","Panipat",132103,"8708155286","aakash.g@gmail.com" ));
		list.add(new AddressBookContent(fname, lname, add, city, zipcode, ph, mail));

		System.out.println("Contact created !!!");
	}
}
