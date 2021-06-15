package recursionInArray;

import java.util.Scanner;

public class OccuranceOflastIndex {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int[] array = {1,2,300,4,5, 300, 23, 100, 4};
		int lastIndex = fingOccuranceOfLastIndex(array, 0, 300);	
		System.out.println(lastIndex);
	}
	public static int fingOccuranceOfLastIndex(int[] array, int idx, int num) {
		if(idx >= array.length) return -1; 
		int lastIndex = fingOccuranceOfLastIndex(array, idx+1, num);
		if(lastIndex == -1) {
			if(array[idx] == num) 
				return idx; 
			else
				return lastIndex;
		}
		else
			return lastIndex;
	}
}
