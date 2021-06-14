package recursionInArray;

import java.util.Scanner;

public class DisplayArrayInReverseUsingRecursion {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int[] array = {1,2,3,4,5};
		displayArrayInReverseUsingRecursion(array, 0);		
	}
	public static void displayArrayInReverseUsingRecursion(int[] array, int idx) {
		if(idx >= array.length) return;
		displayArrayInReverseUsingRecursion(array, idx+1);
		System.out.println(array[idx]);
	}

}
