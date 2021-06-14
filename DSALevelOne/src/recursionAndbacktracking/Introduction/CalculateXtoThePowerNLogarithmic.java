package recursionAndbacktracking.Introduction;

import java.util.Scanner;
// X to the Power N logarithmic time
public class CalculateXtoThePowerNLogarithmic {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int X = scr.nextInt();
		int N = scr.nextInt();
		int result = calculateXtoThePowerNLogarithmic(X, N);
		System.out.print(result);
	}
	public static int calculateXtoThePowerNLogarithmic(int X, int N) {
		if(N == 0) return 1;
		int xTothePowerNby2 = calculateXtoThePowerNLogarithmic(X, N/2);
		int xTothePowerN = xTothePowerNby2 * xTothePowerNby2;
		if(N % 2 == 1) {
			xTothePowerN = xTothePowerN * X;
		}
		return xTothePowerN;
	}
	
}
