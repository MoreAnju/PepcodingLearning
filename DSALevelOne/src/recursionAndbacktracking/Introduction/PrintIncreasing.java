package recursionAndbacktracking.Introduction;
//recursion function to print number in increasing order
import java.util.Scanner;

public class PrintIncreasing {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		printNumbers(num);
	}
	public static void printNumbers(int n) {
		if(n==0) {
			return;
		}
		printNumbers(n -1);
		System.out.print(n + " ");
	}

}
