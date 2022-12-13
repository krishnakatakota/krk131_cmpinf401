package edu.pitt.lab10;

public class Lab10 {

	public static void main(String[] args) {
		System.out.println(sumOfInts(11));
		System.out.println(sumOfInts(0));
		System.out.println(sumOfInts(9));
		System.out.println(sumOfInts(91368)); // Should return 27
		System.out.println("\n\n");
		
		int[] a = {2,5,3,30,753,23124};
		printArrayElements(a, 0);
		
	}
	
	public static int sumOfInts(int num) {
		int x = Math.abs(num);
		
		if (x / 10 == 0) {
			return x;
		}
		else {
			return (x % 10) + sumOfInts(x / 10);
		}
		
	}
	
	public static void printArrayElements(int arr[], int i) {
		
		if(arr.length - 1 == i) {
			System.out.println(arr[0]);
		}
		else {
			System.out.println(arr[i]);
			printArrayElements(arr, i + 1);
		}
		
	}
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		
	}
	
}