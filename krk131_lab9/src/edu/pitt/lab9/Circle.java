package edu.pitt.lab9;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 5.0;
		color = "Green";
	}
	
	public Circle(double rad) {
		radius = rad;
		color = "Green";
	}
	
	public Circle(double rad, String col) {
		radius = rad;
		color = col;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String col) {
		color = col;
	}
	
	public double getArea() {
		return (radius * radius * Math.PI);
	}
}
