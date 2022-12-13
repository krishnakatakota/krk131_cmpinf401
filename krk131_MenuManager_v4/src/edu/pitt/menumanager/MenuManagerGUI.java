package edu.pitt.menumanager;

import java.awt.EventQueue;

/**
 * Class MenuTest author : Krishna Katakota
 * created: 12/12/2022
 */

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import java.util.ArrayList;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class MenuManagerGUI {

	private JFrame frame1, frame2, frame3;

	static MenuManager mm = new MenuManager("data/dishes.txt");
	static FileManager fm = new FileManager();

	static Entree[] entList = new Entree[mm.getEntrees().size()];
	static Side[] sidList = new Side[mm.getSides().size()];
	static Salad[] salList = new Salad[mm.getSalads().size()];
	static Dessert[] desList = new Dessert[mm.getDesserts().size()];

	ArrayList<Menu> menus = new ArrayList<Menu>();
	Menu[] menuArray = new Menu[menus.size()];
	DefaultListModel<Menu> model = new DefaultListModel<>();
	String t = "";

	JPanel buildMenuPanel = new JPanel();
	JList<Menu> lstCreatedMenus = new JList<Menu>(model);
	JLabel lblNewLabel = new JLabel("Build your own Menu");
	JLabel entreeLabel = new JLabel("Entree");
	JLabel sideLabel = new JLabel("Side");
	JLabel saladLabel = new JLabel("Salad");
	JLabel dessertLabel = new JLabel("Dessert");
	JComboBox entreeDrop = new JComboBox(entList);
	JComboBox sideDrop = new JComboBox(sidList);
	JComboBox dessertDrop = new JComboBox(desList);
	JComboBox saladDrop = new JComboBox(salList);
	JButton createMenuBtn = new JButton("Create Menu with these items");
	JPanel generateMenuPanel = new JPanel();
	JButton genRandMenuBtn = new JButton("Generate a Random Menu");
	JLabel lblOrGenerateA = new JLabel("Or generate a Menu");
	JButton genMinMenuBtn = new JButton("Generate a Minimum Calories Menu");
	JButton genMaxMenuBtn = new JButton("Generate a Maximum Calories Menu");
	JSeparator separator = new JSeparator();
	JLabel lblCreatedMenus = new JLabel("Created Menus:");
	JButton btnDetails = new JButton("Details");
	JButton btnDeleteAll = new JButton("Delete all");
	JButton btnSaveToFile = new JButton("Save to file");
	JLabel lblEntree = new JLabel("Entree");
	JTextArea txtEntree = new JTextArea();
	JTextArea txtSide = new JTextArea();
	JLabel lblSide = new JLabel("Side");
	JTextArea txtSalad = new JTextArea();
	JLabel lblSalad = new JLabel("Salad");
	JTextArea txtDessert = new JTextArea();
	JLabel lblDessert = new JLabel("Dessert");
	JTextArea txtCals = new JTextArea();
	JLabel lblCals = new JLabel("Total calories:");
	JTextArea txtPrice = new JTextArea();
	JLabel lblPrice = new JLabel("Total price:");
	JButton btnBack = new JButton("Back");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		for (int i = 0; i < entList.length; i++) {
			entList[i] = mm.getEntrees().get(i);
		}

		for (int i = 0; i < sidList.length; i++) {
			sidList[i] = mm.getSides().get(i);
		}

		for (int i = 0; i < salList.length; i++) {
			salList[i] = mm.getSalads().get(i);
		}

		for (int i = 0; i < desList.length; i++) {
			desList[i] = mm.getDesserts().get(i);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerGUI window = new MenuManagerGUI();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public MenuManagerGUI() {
		initialize1();
	}

	/**
	 * Initialize the contents of frame 1.
	 */
	private void initialize1() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(Color.GRAY);
		frame1.setBounds(100, 100, 700, 500);
		frame1.getContentPane().setLayout(null);

		buildMenuPanel.setBorder(new LineBorder(Color.BLACK, 1, true));
		buildMenuPanel.setBackground(Color.WHITE);
		buildMenuPanel.setBounds(20, 25, 300, 200);
		buildMenuPanel.setLayout(null);
		frame1.getContentPane().add(buildMenuPanel);

		lstCreatedMenus.setBounds(360, 45, 320, 365);
//		lstCreatedMenus.setEditable(true);
//		lstCreatedMenus.setText(desc);
		lstCreatedMenus.setBorder(new LineBorder(Color.BLACK, 1, true));
		frame1.getContentPane().add(lstCreatedMenus);

		lblNewLabel.setBounds(6, 6, 150, 15);
		lblNewLabel.setLabelFor(buildMenuPanel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		buildMenuPanel.add(lblNewLabel);

		entreeLabel.setBounds(30, 40, 60, 16);
		buildMenuPanel.add(entreeLabel);

		sideLabel.setBounds(30, 70, 60, 16);
		sideLabel.setVisible(true);
		buildMenuPanel.add(sideLabel);

		saladLabel.setBounds(30, 100, 61, 16);
		buildMenuPanel.add(saladLabel);

		dessertLabel.setBounds(30, 130, 61, 16);
		buildMenuPanel.add(dessertLabel);

		entreeDrop.setBounds(100, 40, 160, 16);
		buildMenuPanel.add(entreeDrop);

		sideDrop.setBounds(100, 70, 160, 16);
		buildMenuPanel.add(sideDrop);

		saladDrop.setBounds(100, 100, 160, 16);
		buildMenuPanel.add(saladDrop);

		dessertDrop.setBounds(100, 130, 160, 16);
		buildMenuPanel.add(dessertDrop);

		createMenuBtn.setBackground(Color.WHITE);
		createMenuBtn.setBounds(20, 160, 260, 30);
		createMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String title = JOptionPane.showInputDialog(null, "Enter a name for this menu: ", "Enter Menu Name", 1);

				Entree ent = (Entree) entreeDrop.getSelectedItem();
				Side sid = (Side) sideDrop.getSelectedItem();
				Salad sal = (Salad) saladDrop.getSelectedItem();
				Dessert des = (Dessert) dessertDrop.getSelectedItem();

				Menu randMenu = new Menu(title, ent, sid, sal, des);

				menus.add(randMenu);

				model.setSize(model.size() + 1);
				model.add(model.size() - 1, menus.get(menus.size() - 1));
				model.setSize(model.size() - 1);

			}
		});
		buildMenuPanel.add(createMenuBtn);

		generateMenuPanel.setForeground(Color.BLACK);
		generateMenuPanel.setBorder(new LineBorder(Color.BLACK, 1, true));
		generateMenuPanel.setBackground(Color.WHITE);
		generateMenuPanel.setBounds(20, 250, 300, 200);
		frame1.getContentPane().add(generateMenuPanel);
		generateMenuPanel.setLayout(null);

		genRandMenuBtn.setBackground(Color.WHITE);
		genRandMenuBtn.setBounds(20, 45, 260, 30);
		genRandMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String title = JOptionPane.showInputDialog(null, "Enter a name for this menu: ", "Enter Menu Name", 1);

				menus.add(mm.randomMenu(title));

				model.setSize(model.size() + 1);
				model.add(model.size() - 1, menus.get(menus.size() - 1));
				model.setSize(model.size() - 1);

			}
		});
		generateMenuPanel.add(genRandMenuBtn);

		lblOrGenerateA.setBackground(new Color(255, 255, 255));
		lblOrGenerateA.setBounds(6, 6, 150, 15);
		generateMenuPanel.add(lblOrGenerateA);
		lblOrGenerateA.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblOrGenerateA.setLabelFor(generateMenuPanel);

		genMinMenuBtn.setBackground(Color.WHITE);
		genMinMenuBtn.setBounds(20, 95, 260, 30);
		genMinMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String title = JOptionPane.showInputDialog(null, "Enter a name for this menu: ", "Enter Menu Name", 1);

				menus.add(mm.minCaloriesMenu(title));

				model.setSize(model.size() + 1);
				model.add(model.size() - 1, menus.get(menus.size() - 1));
				model.setSize(model.size() - 1);

			}
		});
		generateMenuPanel.add(genMinMenuBtn);

		genMaxMenuBtn.setBackground(Color.WHITE);
		genMaxMenuBtn.setBounds(20, 145, 260, 30);
		genMaxMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String title = JOptionPane.showInputDialog(null, "Enter a name for this menu: ", "Enter Menu Name", 1);

				menus.add(mm.maxCaloriesMenu(title));

				model.setSize(model.size() + 1);
				model.add(model.size() - 1, menus.get(menus.size() - 1));
				model.setSize(model.size() - 1);

			}
		});
		generateMenuPanel.add(genMaxMenuBtn);

		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(334, 25, 12, 427);
		frame1.getContentPane().add(separator);

		lblCreatedMenus.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblCreatedMenus.setBounds(368, 26, 150, 15);
		frame1.getContentPane().add(lblCreatedMenus);

		btnDetails.setBackground(Color.WHITE);
		btnDetails.setBounds(370, 420, 100, 25);
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println(lstCreatedMenus.getSelectedIndex());

				if (lstCreatedMenus.getSelectedIndex() > -1 && lstCreatedMenus.getSelectedIndex() < menus.size()) {
					Menu displayMenu = menus.get(lstCreatedMenus.getSelectedIndex());

					frame1.setVisible(false);
					initialize2(displayMenu);

//					System.out.println(displayMenu.description());
				}
			}
		});
		frame1.getContentPane().add(btnDetails);

		btnDeleteAll.setBackground(Color.WHITE);
		btnDeleteAll.setBounds(470, 420, 100, 25);
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				menus.clear();

				model.setSize(0);

			}
		});
		frame1.getContentPane().add(btnDeleteAll);

		btnSaveToFile.setBackground(Color.WHITE);
		btnSaveToFile.setBounds(570, 420, 100, 25);
		btnSaveToFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				fm.writeMenu("data/output.txt", menus);

			}
		});
		frame1.getContentPane().add(btnSaveToFile);

		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Initialize the contents of frame 2.
	 * 
	 * @param m Passes in a Menu object to be used for display fields
	 */
	private void initialize2(Menu m) {

		frame3 = new JFrame("Menu: " + m.getName());
		frame3.getContentPane().setBackground(Color.GRAY);
		frame3.setBounds(100, 100, 700, 500);
		frame3.getContentPane().setLayout(null);
		frame3.setVisible(true);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblEntree.setBounds(20, 20, 100, 16);
		frame3.getContentPane().add(lblEntree);

		txtEntree.setEditable(false);
		txtEntree.setBounds(130, 20, 550, 60);
		txtEntree.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtEntree.setBackground(Color.WHITE);
		txtEntree.setText(m.getEnt().getName() + " - " + m.getEnt().getDesc() + ".\nCalories: " + m.getEnt().getCal()
				+ ". Price: $" + m.getEnt().getPrice() + "0");
		txtEntree.setLineWrap(true);
		frame3.getContentPane().add(txtEntree);

		txtSide.setEditable(false);
		txtSide.setBounds(130, 95, 550, 60);
		txtSide.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtSide.setBackground(Color.WHITE);
		txtSide.setText(m.getSid().getName() + " - " + m.getSid().getDesc() + ".\nCalories: " + m.getSid().getCal()
				+ ". Price: $" + m.getSid().getPrice() + "0");
		txtSide.setLineWrap(true);

		frame3.getContentPane().add(txtSide);

		lblSide.setBounds(20, 95, 100, 16);
		frame3.getContentPane().add(lblSide);

		txtSalad.setEditable(false);
		txtSalad.setBounds(130, 170, 550, 60);
		txtSalad.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtSalad.setBackground(Color.WHITE);
		txtSalad.setText(m.getSal().getName() + " - " + m.getSal().getDesc() + ".\nCalories: " + m.getSal().getCal()
				+ ". Price: $" + m.getSal().getPrice() + "0");
		txtSalad.setLineWrap(true);
		frame3.getContentPane().add(txtSalad);

		lblSalad.setBounds(20, 170, 100, 16);
		frame3.getContentPane().add(lblSalad);

		txtDessert.setEditable(false);
		txtDessert.setBounds(130, 245, 550, 60);
		txtDessert.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtDessert.setBackground(Color.WHITE);
		txtDessert.setText(m.getDes().getName() + " - " + m.getDes().getDesc() + ".\nCalories: " + m.getDes().getCal()
				+ ". Price: $" + m.getDes().getPrice() + "0");
		txtDessert.setLineWrap(true);
		frame3.getContentPane().add(txtDessert);

		lblDessert.setBounds(20, 245, 100, 16);
		frame3.getContentPane().add(lblDessert);

		txtCals.setEditable(false);
		txtCals.setBounds(130, 330, 100, 25);
		txtCals.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtCals.setBackground(Color.WHITE);
		txtCals.setText("" + m.totalCalories());
		frame3.getContentPane().add(txtCals);

		lblCals.setBounds(20, 335, 100, 16);
		frame3.getContentPane().add(lblCals);

		txtPrice.setEditable(false);
		txtPrice.setBounds(130, 370, 100, 25);
		txtPrice.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtPrice.setBackground(Color.WHITE);
		txtPrice.setText("$" + m.getTotalPrice() + "0");
		frame3.getContentPane().add(txtPrice);

		lblPrice.setBounds(20, 375, 100, 16);
		frame3.getContentPane().add(lblPrice);

		btnBack.setBounds(585, 430, 100, 30);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame3.setVisible(false);
				frame1.setVisible(true);

			}
		});
		frame3.getContentPane().add(btnBack);

	}
}
