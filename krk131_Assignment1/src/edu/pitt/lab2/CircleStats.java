package edu.pitt.lab2;

import javax.swing.JOptionPane;

public class CircleStats {
	
	private double r, area, perim;
	
	private void getInput() {
		r = Double.parseDouble(JOptionPane.showInputDialog("Please input the circle's radius"));
	}
	
	private void calcArea() {
		area = r * r * Math.PI;
		area = Math.round(area * 100);
		area = area / 100;
	}
	
	private void calcPerim() {
		perim = r * 2 * Math.PI;
		perim = Math.round(perim * 100);
		perim = perim / 100;
	}
	
	public void run() {
		getInput();
		calcArea();
		calcPerim();
		JOptionPane.showMessageDialog(null, "The circle with radius " + r + " has an area of " + area + " and a perimeter of " + perim);
	}
}
