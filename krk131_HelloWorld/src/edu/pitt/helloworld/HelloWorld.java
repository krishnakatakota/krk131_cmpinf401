package edu.pitt.helloworld;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
				
		String name = JOptionPane.showInputDialog("Enter your name");
		
		JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
	}

}
