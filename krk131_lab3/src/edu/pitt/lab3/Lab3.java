package edu.pitt.lab3;

import javax.swing.JOptionPane;

public class Lab3 {

	public static void main(String[] args) {
		
		String input;
		
		do {
			input = JOptionPane.showInputDialog(null, "Please enter a distance or weight amount in cm, in, yd, m, oz, gm, kg, or lb\nex: 525600 cm", "Unit Converter", JOptionPane.INFORMATION_MESSAGE).toLowerCase();
		} while (input == null || input == "" || input.indexOf(" ") < 0);
		
		if (input != null && input != "" && input.indexOf(" ") > 0) {
			double num = Double.parseDouble(input.substring(0, input.indexOf(" ")));
			String unit = input.substring(input.indexOf(" ") + 1);

			UnitConverter c = new UnitConverter();
			c.convert(num, unit);
		}

	}
}
