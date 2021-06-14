package recursionAndbacktracking;
// Tower of hanoi using recursion, 3 tower
import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int tId1 = scr.nextInt();
		int tId2 = scr.nextInt();
		int tId3 = scr.nextInt();
		towerofhanoi(n, tId1, tId2,tId3);
		
	}
	public static void towerofhanoi(int n, int tId1, int tId2, int tId3){
		if(n == 0) return;
		towerofhanoi(n-1, tId1, tId3, tId2);
		System.out.println(n +" = " + tId1 + " ->" + tId2);
		towerofhanoi(n-1, tId3, tId2, tId1);		
	}
	
}
