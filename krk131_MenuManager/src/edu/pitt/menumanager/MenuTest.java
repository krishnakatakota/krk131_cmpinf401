package edu.pitt.menumanager;

import javax.swing.JOptionPane;

/**
 * Class MenuTest
 * author : Krishna Katakota
 * created: 10/04/2022
 */


public class MenuTest {

	public static void main(String[] args) {
		Entree pep = new Entree("Pepperoni Pizza", "a pizza. its got pepperoni or smth apparently", 500);
		Entree chee = new Entree("Cheese Pizza", "a pizza. im gonna go ahead and guess it has cheese", 500);

		Side soup = new Side("French Onion Soup", "soup. french. boiled onion idk go away", 300);

		Salad mac = new Salad("Macaroni Salad", "basically pasta with mayo, just... dont order this.", 400);
		Salad caesar = new Salad("Caesar Salad", "hah i stabbed ur salad lmao", 400);

		Dessert lava = new Dessert("Chocolate Lava Cake", "chocolate cake, except it might burn you",600);
		
		Menu menu1 = new Menu("uhhhhhh food",pep, soup, mac, lava);
		Menu menu2 = new Menu("uhhhhhh rock",chee, soup, caesar, lava);
		Menu menu3 = new Menu("uhhhhhh rock",chee, soup);
		
		System.out.println(menu1.description());
		System.out.println(menu2.description());
		System.out.println(menu3.description());
		
//		JOptionPane.showMessageDialog(null, menu1.description());
//		JOptionPane.showMessageDialog(null, menu2.description());
//		JOptionPane.showMessageDialog(null, menu3.description());
		
	}
}