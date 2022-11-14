package edu.pitt.lab9;

public class Student extends Person {

	String program;
	int year;
	double fee;

	public Student(String n, String a, String p, int y, double f) {
		setName(n);
		setAddress(a);
		program = p;
		year = y;
		fee = f;
	}

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}

	public void setProgram(String p) {
		program = p;
	}

	public void setYear(int y) {
		year = y;
	}

	public void setFee(double f) {
		fee = f;
	}

	public String toString() {
		String msg = "";

		msg += "Name: \t\t" + getName() + "\n";
		msg += "Address: \t" + getAddress() + "\n";
		msg += "Program: \t" + program + "\n";
		msg += "Year: \t\t" + year + "\n";
		msg += "Fee: \t\t" + fee + "\n";

		return msg;
	}

}
