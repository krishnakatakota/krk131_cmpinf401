package edu.pitt.palindrome;

import javax.swing.JOptionPane;

public class Palindrome {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Please enter a word or a phrase: ", "Palindrome Finder", JOptionPane.INFORMATION_MESSAGE).toLowerCase();
		
		String phrase = input.replaceAll(" ", "").trim();
		String reverse = "";
		
		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);
			reverse = c + reverse;
		}
		
		System.out.println("Phrase:\n" + phrase + "\nReverse:\n" + reverse + "\n\nComplete!");
		
		System.out.println("Palindrome = " + (phrase.equals(reverse)) + "!");
		
	}

}
