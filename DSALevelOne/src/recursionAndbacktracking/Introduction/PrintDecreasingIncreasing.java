package recursionAndbacktracking;
// print Increasing Decreasing order number using recursion.
import java.util.Scanner;

public class PrintDecreasingIncreasing {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		printDecreasingIncreasing(num);
	}
	public static void printDecreasingIncreasing(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasingIncreasing(n-1);
		System.out.println(n);
	}
}
