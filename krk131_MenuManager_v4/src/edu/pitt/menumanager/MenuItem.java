package edu.pitt.menumanager;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 12/12/2022
 */

public class MenuItem {

	private String name, description;
	private int calories;
	private double price;

	public MenuItem(String n, String d, int c, double p) {
		name = n;
		description = d;
		calories = c;
		price = p;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getCal() {
		return calories;
	}

	public void setName(String title) {
		name = title;
	}

	public void setDesc(String desc) {
		description = desc;
	}

	public void setCal(int cal) {
		calories = cal;
	}

	public void setPrice(double p) {
		price = p;
	}

}
