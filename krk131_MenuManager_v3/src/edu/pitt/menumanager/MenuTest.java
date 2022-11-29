package edu.pitt.menumanager;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 11/28/2022
 */

public class MenuTest {

	public static void main(String[] args) {

		MenuManager mm = new MenuManager("data/dishes.txt");
		FileManager fm = new FileManager();
		
		System.out.println(mm.maxCaloriesMenu("Max Calories Menu").description());
		System.out.println(mm.minCaloriesMenu("Min Calories Menu").description());
		
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(mm.randomMenu("random menu 1"));
		menus.add(mm.randomMenu("random menu 2"));
		menus.add(mm.randomMenu("random menu 3"));
		menus.add(mm.randomMenu("random menu 4"));
		menus.add(mm.maxCaloriesMenu("Max Calories Menu"));
		menus.add(mm.minCaloriesMenu("Min Calories Menu"));
		
		
		fm.writeMenu("data/output.txt", menus);
		
	}
}