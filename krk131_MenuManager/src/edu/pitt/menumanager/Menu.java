package edu.pitt.menumanager;

/**
 * Class Menu 
 * author : Krishna Katakota
 * created: 10/04/2022
 */

public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	public Menu(String title) {
		name = title;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}

	public Menu(String title, Entree en, Side si) {
		name = title;
		entree = en;
		side = si;
		salad = null;
		dessert = null;
	}

	public Menu(String title, Entree en, Side si, Salad sa, Dessert de) {
		name = title;
		entree = en;
		side = si;
		salad = sa;
		dessert = de;
	}

	public String getName() {
		return name;
	}

	public int totalCal() {
		int totalCals = 0;

		totalCals += entree.getCal();
		totalCals += side.getCal();
		totalCals += salad.getCal();
		totalCals += dessert.getCal();

		return totalCals;
	}

	public String description() {
		String msg = "";

		msg += "Entree: ";
		if (entree != null) {
			msg += entree.getName() + ": " + entree.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		msg += "Side: ";
		if (side != null) {
			msg += side.getName() + ": " + side.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		msg += "Salad: ";
		if (salad != null) {
			msg += salad.getName() + ": " + salad.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		msg += "Dessert: ";
		if (dessert != null) {
			msg += dessert.getName() + ": " + dessert.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		return msg;
	}

	public void setName(String title) {
		name = title;
	}
}
