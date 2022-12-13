package edu.pitt.menumanager;

import java.util.ArrayList;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 12/12/2022
 */

public class MenuManager {

	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	public MenuManager(String filename) {
		FileManager fm = new FileManager();
		ArrayList<MenuItem> items = fm.readItems(filename);

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof Entree) {
				entrees.add((Entree) items.get(i));
			} else if (items.get(i) instanceof Side) {
				sides.add((Side) items.get(i));
			} else if (items.get(i) instanceof Salad) {
				salads.add((Salad) items.get(i));
			} else if (items.get(i) instanceof Dessert) {
				desserts.add((Dessert) items.get(i));
			}
		}
	}

	public void setEntrees(ArrayList<Entree> ents) {
		entrees = ents;
	}

	public void setSides(ArrayList<Side> sids) {
		sides = sids;
	}

	public void setSalads(ArrayList<Salad> sals) {
		salads = sals;
	}

	public void setDesserts(ArrayList<Dessert> dess) {
		desserts = dess;
	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public Menu randomMenu(String name) {
		Menu randomMenu = new Menu(name);

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

	public Menu minCaloriesMenu(String name) {
		int minEntCal = entrees.get(0).getCal();
		int minSidCal = sides.get(0).getCal();
		int minSalCal = salads.get(0).getCal();
		int minDesCal = desserts.get(0).getCal();

		Menu minCalMenu = new Menu(name);

		Entree minEnt = entrees.get(0);
		Side minSid = sides.get(0);
		Salad minSal = salads.get(0);
		Dessert minDes = desserts.get(0);

		for (Entree ent : entrees) {
			if (ent.getCal() < minEntCal) {
				minEnt = ent;
				minEntCal = ent.getCal();
			}
		}
		for (Side sid : sides) {
			if (sid.getCal() < minSidCal) {
				minSid = sid;
				minSidCal = sid.getCal();
			}
		}
		for (Salad sal : salads) {
			if (sal.getCal() < minSalCal) {
				minSal = sal;
				minSalCal = sal.getCal();
			}
		}
		for (Dessert des : desserts) {
			if (des.getCal() < minDesCal) {
				minDes = des;
				minDesCal = des.getCal();
			}
		}

		minCalMenu.setEntree(minEnt);
		minCalMenu.setSide(minSid);
		minCalMenu.setSalad(minSal);
		minCalMenu.setDessert(minDes);

		return minCalMenu;
	}

	public Menu maxCaloriesMenu(String name) {
		int maxEntCal = entrees.get(0).getCal();
		int maxSidCal = sides.get(0).getCal();
		int maxSalCal = salads.get(0).getCal();
		int maxDesCal = desserts.get(0).getCal();

		Menu maxCalMenu = new Menu(name);

		Entree maxEnt = entrees.get(0);
		Side maxSid = sides.get(0);
		Salad maxSal = salads.get(0);
		Dessert maxDes = desserts.get(0);

		for (Entree ent : entrees) {
			if (ent.getCal() > maxEntCal) {
				maxEnt = ent;
				maxEntCal = ent.getCal();
			}
		}
		for (Side sid : sides) {
			if (sid.getCal() > maxSidCal) {
				maxSid = sid;
				maxSidCal = sid.getCal();
			}
		}
		for (Salad sal : salads) {
			if (sal.getCal() > maxSalCal) {
				maxSal = sal;
				maxSalCal = sal.getCal();
			}
		}
		for (Dessert des : desserts) {
			if (des.getCal() > maxDesCal) {
				maxDes = des;
				maxDesCal = des.getCal();
			}
		}

		maxCalMenu.setEntree(maxEnt);
		maxCalMenu.setSide(maxSid);
		maxCalMenu.setSalad(maxSal);
		maxCalMenu.setDessert(maxDes);

		return maxCalMenu;
	}

}
