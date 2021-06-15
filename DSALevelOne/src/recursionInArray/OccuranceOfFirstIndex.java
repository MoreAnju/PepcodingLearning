package recursionInArray;

import java.util.Scanner;

public class OccuranceOfFirstIndex {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int[] array = {1,2,300,4,5, 300, 23, 100, 4};
		int firstIndex = fingOccuranceOfFirstIndex(array, 0, 300);	
		System.out.println(firstIndex);
	}
	public static int fingOccuranceOfFirstIndex(int[] array, int idx, int num){
		if(idx >= array.length) return -1;
		if(array[idx] == num) return idx;
		else 
		return fingOccuranceOfFirstIndex(array,idx + 1, num);
	}	
}
