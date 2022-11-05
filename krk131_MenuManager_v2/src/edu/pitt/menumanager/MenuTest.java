package edu.pitt.menumanager;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 11/04/2022
 */

public class MenuTest {

	public static void main(String[] args) {

		MenuRandomize randomize = new MenuRandomize("data/entrees.txt", "data/sides.txt", "data/salads.txt",
				"data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description() + "\nTotal calories: " + myMenu.totalCalories());

	}
}