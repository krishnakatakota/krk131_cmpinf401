package edu.pitt.menumanager;

import java.util.ArrayList;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 11/04/2022
 */

public class MenuRandomize {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	/**
	 * 
	 * @param entFile  file path for entrees file
	 * @param sideFile file path for sides file
	 * @param salFile  file path for salads file
	 * @param desFile  file path for desserts file
	 */
	MenuRandomize(String entFile, String sideFile, String salFile, String desFile) {
		entrees = new ArrayList<Entree>(FileManager.readEntrees(entFile));
		sides = new ArrayList<Side>(FileManager.readSides(sideFile));
		salads = new ArrayList<Salad>(FileManager.readSalads(salFile));
		desserts = new ArrayList<Dessert>(FileManager.readDesserts(desFile));
	}

	/**
	 * 
	 * @return Menu object containing random Entree, Side, Salad, and Dessert
	 *         objects
	 */
	public Menu randomMenu() {

		Menu randomMenu = new Menu("Random Menu");

		int rand1 = (int) (Math.random() * 3);
		int rand2 = (int) (Math.random() * 3);
		int rand3 = (int) (Math.random() * 3);
		int rand4 = (int) (Math.random() * 3);

		randomMenu.setEntree(entrees.get(rand1));
		randomMenu.setSide(sides.get(rand2));
		randomMenu.setSalad(salads.get(rand3));
		randomMenu.setDessert(desserts.get(rand4));

		return randomMenu;
	}
}
