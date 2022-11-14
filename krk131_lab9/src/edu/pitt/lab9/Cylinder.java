package edu.pitt.lab9;

public class Cylinder extends Circle {

	private double height;

	public Cylinder() {
		height = 1.0;
	}

	public Cylinder(double rad, double h) {
		super(rad);
		height = h;
	}

	public Cylinder(double rad, double h, String col) {
		super(rad, col);
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getVolume() {
		return (super.getArea() * height);
	}

}
