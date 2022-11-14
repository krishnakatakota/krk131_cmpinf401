package edu.pitt.lab9;

public class Staff extends Person {

	private String school;
	private double pay;

	public Staff(String n, String a, double p) {
		setName(n);
		setAddress(a);
		pay = p;
	}

	public String getSchool() {
		return school;
	}

	public double getPay() {
		return pay;
	}

	public void setSchool(String s) {
		school = s;
	}

	public void setPay(double p) {
		pay = p;
	}

	public String toString() {
		String msg = "";

		msg += "Name: \t\t" + getName() + "\n";
		msg += "Address: \t" + getAddress() + "\n";
		msg += "School: \t" + school + "\n";
		msg += "Pay: \t\t" + pay + "\n";

		return msg;
	}

}
