package recursionAndbacktracking;
//Factorial Using Recursion. 
import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int fact = factorialRecursion(num);
		System.out.println(fact);
	}
	public static int factorialRecursion(int n) {
		if(n == 1) return 1;
		int factorialMinusOne = factorialRecursion(n-1);
		int factorial = n * factorialMinusOne;
		return factorial;
	}

}
