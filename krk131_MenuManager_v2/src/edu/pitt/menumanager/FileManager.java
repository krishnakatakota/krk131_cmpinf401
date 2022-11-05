package edu.pitt.menumanager;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 11/04/2022
 */

public class FileManager {

	/**
	 * 
	 * @param filePath file path for entrees file
	 * @return ArrayList containing all entrees as Entree objects
	 */
	public static ArrayList<Entree> readEntrees(String filePath) {
		ArrayList entrees = new ArrayList<Entree>();
		String ents[] = null;
		String path = filePath;

		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				ents = line.split("@@");
				Entree e = new Entree(ents[0], ents[1], Integer.parseInt(ents[2]));
				entrees.add(e);
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return entrees;
	}

	/**
	 * 
	 * @param filePath file path for sides file
	 * @return ArrayList containing all sides as Side objects
	 */
	public static ArrayList<Side> readSides(String filePath) {
		ArrayList<Side> sides = new ArrayList<Side>();
		String sid[] = null;
		String path = filePath;

		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				sid = line.split("@@");
				Side e = new Side(sid[0], sid[1], Integer.parseInt(sid[2]));
				sides.add(e);
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return sides;
	}

	/**
	 * 
	 * @param filePath file path for salads file
	 * @return ArrayList containing all salads as Salad objects
	 */
	public static ArrayList<Salad> readSalads(String filePath) {
		ArrayList<Salad> salads = new ArrayList<Salad>();
		String sal[] = null;
		String path = filePath;

		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				sal = line.split("@@");
				Salad e = new Salad(sal[0], sal[1], Integer.parseInt(sal[2]));
				salads.add(e);
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return salads;
	}

	/**
	 * 
	 * @param filePath file path for desserts file
	 * @return ArrayList containing all desserts as Dessert objects
	 */
	public static ArrayList<Dessert> readDesserts(String filePath) {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		String des[] = null;
		String path = filePath;

		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				des = line.split("@@");
				Dessert e = new Dessert(des[0], des[1], Integer.parseInt(des[2]));
				desserts.add(e);
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return desserts;
	}
}
