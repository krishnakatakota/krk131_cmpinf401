package edu.pitt.menumanager;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 11/04/2022
 */

public class FileManager {

	/**
	 * 
	 * @param filePath file path for food items file
	 * @return ArrayList containing all food items as generic MenuItem objects
	 */
	public static ArrayList<MenuItem> readItems(String filePath) {
		ArrayList items = new ArrayList<MenuItem>();
		String arr[] = null;
		String path = filePath;

		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				arr = line.split("@@");
				if (arr[1].equals("entree")) {
					Entree x = new Entree(arr[0], arr[2], Integer.parseInt(arr[3]), Double.parseDouble(arr[4]));
					items.add(x);
				} else if (arr[1].equals("side")) {
					Side x = new Side(arr[0], arr[2], Integer.parseInt(arr[3]), Double.parseDouble(arr[4]));
					items.add(x);
				} else if (arr[1].equals("salad")) {
					Salad x = new Salad(arr[0], arr[2], Integer.parseInt(arr[3]), Double.parseDouble(arr[4]));
					items.add(x);
				} else if (arr[1].equals("dessert")) {
					Dessert x = new Dessert(arr[0], arr[2], Integer.parseInt(arr[3]), Double.parseDouble(arr[4]));
					items.add(x);
				}
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return items;
	}
	
	public static void writeMenu(String filePath, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < menus.size(); i++) {
				bw.write(menus.get(i).description());
				bw.newLine();
			}

			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
