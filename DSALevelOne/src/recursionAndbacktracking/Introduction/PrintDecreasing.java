package recursionAndbacktracking.Introduction;
// recursion function to print number in decreasing order
import java.util.Scanner;

public class PrintDecreasing {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		printNumbers(num);
	}
	public static void printNumbers(int n) {
		if(n == 0) { // base case
			return;
		}
		System.out.print(n + " ");
		printNumbers(n-1);
	}

}
