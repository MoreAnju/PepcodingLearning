package recursionInArray;

import java.util.Scanner;

public class MaxOfArrayUsingRecursionTwo {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int[] array = {1,2,300,4,5, 23, 100};
		int max = fingMaxOfArrayUsingRecursion(array, 0);	
		System.out.println(max);
	}
	public static int fingMaxOfArrayUsingRecursion(int[] array, int idx) {
		if(idx == array.length -1 ) return array[idx];
		int max = fingMaxOfArrayUsingRecursion(array, idx + 1);
		if(max > array[idx]){
			return max;
		}
		else return array[idx];
	}
}
