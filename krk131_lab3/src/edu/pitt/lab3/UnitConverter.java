package edu.pitt.lab3;

import javax.swing.JOptionPane;

public class UnitConverter {
	private final double 
			cmToIn = 0.393701, 
			inToCm = 2.54,
			ydToM = 0.9144,
			mToYd = 1.09361,
			ozToGm = 28.3495,
			gmToOz = 0.035274,
			lbToKg = 0.453592,
			kgToLb = 2.204620823516057;
	
	private double outVal;
	private String outUnit;
	
	public void convert(double inVal, String inUnit) {
		String outMsg = "";
		
		if (inUnit.equalsIgnoreCase("cm")) {
			outVal = inVal * cmToIn;
			outUnit = "in";
		}
		else if (inUnit.equalsIgnoreCase("in")) {
			outVal = inVal * inToCm;
			outUnit = "cm";
		}
		else if (inUnit.equalsIgnoreCase("yd")) {
			outVal = inVal * ydToM;
			outUnit = "m";
		}
		else if (inUnit.equalsIgnoreCase("m")) {
			outVal = inVal * mToYd;
			outUnit = "yd";
		}
		else if (inUnit.equalsIgnoreCase("oz")) {
			outVal = inVal * ozToGm;
			outUnit = "gm";
		}
		else if (inUnit.equalsIgnoreCase("gm")) {
			outVal = inVal * gmToOz;
			outUnit = "oz";
		}
		else if (inUnit.equalsIgnoreCase("lb")) {
			outVal = inVal * lbToKg;
			outUnit = "kg";
		}
		else if (inUnit.equalsIgnoreCase("kg")) {
			outVal = inVal * kgToLb;
			outUnit = "lb";
		}
		
		outVal = (Math.round(outVal * 100000));
		outVal = outVal / 100000;
		
		outMsg = inVal + " " + inUnit + " = " + outVal + " " + outUnit;
		
		
		JOptionPane.showMessageDialog(null, outMsg, "Conversion Successful!", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
