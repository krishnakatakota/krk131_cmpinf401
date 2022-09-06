package edu.pitt.lab2;

public class Lab2 {

	public static void main(String[] args) {
		PythagoreanTheorem pyth = new PythagoreanTheorem();
		pyth.run();
		
		CircleStats circ = new CircleStats();
		circ.run();
		
		MoneyDecomposition cash = new MoneyDecomposition();
		cash.run();
	}

}
