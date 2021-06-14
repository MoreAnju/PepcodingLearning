package recursionAndbacktracking.Introduction;
// power function Using recursion
import java.util.Scanner;

public class CalculateXtoThePowerN {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int X = scr.nextInt();
		int N = scr.nextInt();
		int result = calculateXtoThePowerN(X, N);
		System.out.print(result);
	}
	public static int calculateXtoThePowerN(int X, int N) {
		if(N == 0) {
			return 1;
		}
		int XminusOneFact = calculateXtoThePowerN(X, N-1);
		int fact = XminusOneFact * X;
		return fact;
	}
}
