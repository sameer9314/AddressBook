package com.bridgelabz.simpleaddressbook;

public class AddressBookFactory {
	static AddressBookSerializer objectManager(String name) {
		if(name.equalsIgnoreCase("json")) {
			return new JsonSerializer();
		}
		return new JdbcSerializer();
	} 
}
