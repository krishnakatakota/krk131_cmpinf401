package edu.pitt.lab2;

import javax.swing.JOptionPane;

public class PythagoreanTheorem {
	
	private double a, b, c;
	
	private void getInput() {
		a = Double.parseDouble(JOptionPane.showInputDialog("Please input side length of 'a':"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Please input side length of 'b':"));
	}
	
	private void calcHypotenuse() {
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		c = Math.round(c * 100);
		c = c / 100;
	}
	
	public void run() {
		getInput();
		calcHypotenuse();
		JOptionPane.showMessageDialog(null, "For side lengths of " + a + " and " + b + ", the hypotenuse is: " + c + "!");
	}
}
