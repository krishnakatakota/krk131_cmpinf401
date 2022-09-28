package edu.pitt.lab5;

import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		long rolls;
		String input, play = "y";

		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.print("Enter number of dice rolls: ");
				input = sc.nextLine();
			} while (input == null || input.equals(""));

			rolls = Long.parseLong(input);

			rollDice(rolls, new Random());

			System.out.println("Would you like to run another experiment? y or n");
			play = sc.nextLine();
			System.out.println("\n");
		} while (play.equals("y"));

		System.out.println("Program Complete");
		sc.close();
	}

	private static void rollDice(long num, Random rand) {
		int rand1 = 0, rand2 = 0, randNum;
		int[] numNums = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] numLabels = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		String msg = "\nSimulation Results\n---------------\nRolls: " + num + "\n\n";

		for (int i = 0; i < num; i++) {
			randNum = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
			numNums[randNum - 2]++;
		}

		for (int i = 0; i < numNums.length; i++) {
			double percent = (double) numNums[i] / num * 100;
			percent = (Math.round(percent * 1000000));
			percent = percent / 1000000;
			msg += numLabels[i] + ": " + numNums[i] + ",  " + percent + "%\n";
		}

		System.out.println(msg);
	}
}

//9223372036