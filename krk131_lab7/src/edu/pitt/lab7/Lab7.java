package edu.pitt.lab7;

import javax.swing.JOptionPane;

public class Lab7 {

	public static void main(String[] args) {
		int arrSize = 0;

		arrSize = Integer.parseInt(JOptionPane.showInputDialog(null, "How many values will be entered into the array?\nEnter an integer",
				"Lab 7", JOptionPane.INFORMATION_MESSAGE));

		double[] array1 = new double[arrSize];

		for (int i = 0; i < arrSize; i++) {
			array1[i] = Math.random();
		}

		for (int i = 0; i < arrSize; i++) {
			System.out.print(array1[i] + ", ");
		}
		
		System.out.println();
		System.out.println(max(array1));
		System.out.println(min(array1));
		System.out.println(sum(array1));
		System.out.println(avg(array1));
	}

	public static double max(double[] data) {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	public static double min(double[] data) {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	public static double sum(double[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	public static double avg(double[] data) {
		return (sum(data) / data.length);
	}

}