package recursionInArray;
// find max in Array using recursion
import java.util.Scanner;

public class MaxOfArrayUsingRecursion {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int[] array = {1,2,3,4,5, 23, 100};
		int max = fingMaxOfArrayUsingRecursion(array, 0, 0);	
		System.out.println(max);
	}
	public static int fingMaxOfArrayUsingRecursion(int[] array, int idx, int max){
		if(idx >= array.length) return max;
		if(max < array[idx]) {
			max = array[idx];
		}
		return fingMaxOfArrayUsingRecursion(array, idx+1, max);			
	}
}
