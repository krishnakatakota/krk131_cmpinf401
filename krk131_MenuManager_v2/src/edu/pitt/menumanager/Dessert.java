package edu.pitt.menumanager;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 11/04/2022
 */

public class Dessert {
	private String name, description;
	private int calories;

	public Dessert(String title, String desc, int cal) {
		name = title;
		description = desc;
		calories = cal;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return description;
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
}
