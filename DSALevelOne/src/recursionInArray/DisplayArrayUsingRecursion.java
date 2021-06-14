package recursionInArray;
//display array using recursion
import java.util.Scanner;

public class DisplayArrayUsingRecursion {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int[] array = {1,2,3,4,5};
		displayArray(array, 0);		
	}
	public static void displayArray(int[] array, int idx) {
		if(idx >= array.length) return;
		System.out.println(array[idx]);
		displayArray(array, idx+1);		
	}
}
