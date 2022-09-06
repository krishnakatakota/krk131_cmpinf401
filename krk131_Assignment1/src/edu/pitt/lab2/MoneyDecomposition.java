package edu.pitt.lab2;

import javax.swing.JOptionPane;

public class MoneyDecomposition {
	
	private int money, tempMoney, ones, tens, hundreds, thousands;
	private final int GRANDS = 1000, BENJAMINS= 100, SAWBUCKS = 10;
	
	private void getInput() {
		money = Integer.parseInt(JOptionPane.showInputDialog("Please input an amount between 1-9999 dollars"));
		tempMoney = money;
	}
	
	private void calcCash() {
		thousands = tempMoney / GRANDS;
		tempMoney = tempMoney % GRANDS;
		
		hundreds = tempMoney / BENJAMINS;
		tempMoney = tempMoney % BENJAMINS;
		
		tens = tempMoney / SAWBUCKS;
		tempMoney = tempMoney % SAWBUCKS;
		
		ones = tempMoney;

	}
	
	public void run() {
		getInput();
		calcCash();
		JOptionPane.showMessageDialog(null, money + " Dollars is the same as:\nGrands: " + thousands + "\nBenjamins: " + hundreds + "\nSawbucks: " + tens + "\nBucks: " + ones);
	}
}
