package recursionInArray;
import java.util.Scanner;
// Occurrence of the all indexes using recursion.
public class OccuranceOfAllIndexs {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int[] array = {1,2,300,4,5, 300, 23, 100, 4};
		int[] result = fingOccuranceOfAllIndexs(array, 0, 300, 0);	
		for(int i: result)
			System.out.println(i);
		
	}
	public static int[] fingOccuranceOfAllIndexs(int array[], int idx, int num, int count) {
		if(idx == array.length) return new int[count];
		if(array[idx] == num) {
			int[] res = fingOccuranceOfAllIndexs(array, idx+1, num, count +1);
			res[count] = idx;
			return res;
		}
		else {
			int[] res = fingOccuranceOfAllIndexs(array, idx+1, num, count);
			return res;
		}
	}
}
