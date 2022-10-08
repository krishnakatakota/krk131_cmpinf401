package edu.pitt.menumanager;

/**
 * Class Side
 * author : Krishna Katakota
 * created: 10/04/2022
 */

public class Side {
	private String name, description;
	private int calories;
	
	public Side(String title, String desc, int cal) {
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
