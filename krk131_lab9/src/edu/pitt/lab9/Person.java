package edu.pitt.lab9;

public abstract class Person {
	private String name, address = "String";

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAddress(String a) {
		address = a;
	}

}