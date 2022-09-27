package edu.pitt.lab4;

import javax.swing.JOptionPane;

public class Lab4 {

	public static void main(String[] args) {
		
		String input;
		int x, b, ans;
		
		do {
			input = JOptionPane.showInputDialog(null, "floor(logₙ(x))\nEnter the value of x as an integer greater than 0", "floor(logₙ(x)) Calculator", JOptionPane.INFORMATION_MESSAGE);
			x = Integer.parseInt(input);
		} while (input == null || input == "" || x <= 0);
		
		do {
			input = JOptionPane.showInputDialog(null, "floor(logₙ(x))\nEnter the value of n as an integer greater than 0", "floor(logₙ(x)) Calculator", JOptionPane.INFORMATION_MESSAGE);
			b = Integer.parseInt(input);
		} while (input == null || input == "" || b <= 0);
		
		ans = 0;
		
		for (int comp = x; comp >= b; comp = comp / b) {
			ans++;
		}
		
		JOptionPane.showMessageDialog(null, "floor(log" + b + "(" + x + ")) = " + ans, "floor(logₙ(x)) Calculator", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
