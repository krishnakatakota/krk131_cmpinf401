package edu.pitt.menumanager;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 11/04/2022
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

	public int totalCalories() {
		int totalCals = 0;

		if (entree != null) {
			totalCals += entree.getCal();
		}
		if (side != null) {
			totalCals += side.getCal();
		}
		if (salad != null) {
			totalCals += salad.getCal();
		}
		if (dessert != null) {
			totalCals += dessert.getCal();
		}

		return totalCals;
	}

	public String description() {
		String msg = name + "\n--------------------------------\n";

		msg += "- " + getEntree(entree);
		msg += "- " + getSide(side);
		msg += "- " + getSalad(salad);
		msg += "- " + getDessert(dessert);
		msg += "Price: $" + getTotalPrice() + "\n";

		return msg;
	}

	public String getEntree(Entree ent) {
		String msg = "Entree: ";
		if (ent != null) {
			msg += ent.getName() + ": " + ent.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		return msg;
	}

	public String getSide(Side si) {
		String msg = "Side: ";
		if (si != null) {
			msg += si.getName() + ": " + si.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		return msg;
	}

	public String getSalad(Salad sal) {
		String msg = "Salad: ";
		if (sal != null) {
			msg += sal.getName() + ": " + sal.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		return msg;
	}

	public String getDessert(Dessert des) {
		String msg = "Dessert: ";
		if (des != null) {
			msg += des.getName() + ": " + des.getDesc() + "\n";
		} else {
			msg += "N/A\n";
		}

		return msg;
	}
	
	public double getTotalPrice() {
		double price = 0;
		price += entree.getPrice();
		price += side.getPrice();
		price += salad.getPrice();
		price += dessert.getPrice();
		return price;
	}
	
	public void setName(String title) {
		name = title;
	}

	public void setEntree(Entree ent) {
		entree = ent;
	}

	public void setSide(Side si) {
		side = si;
	}

	public void setSalad(Salad sal) {
		salad = sal;
	}

	public void setDessert(Dessert des) {
		dessert = des;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
