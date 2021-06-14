import java.util.Arrays;

public class KthLargestElement {
	public static int findNumber(int[] numbers, int k) {
		int count=0;
		for(int i= numbers.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(numbers[j] > numbers[j+1]) {
					swapNumbers(j, j+1, numbers);
				}	
			}
			count ++;
			if(count == k) return numbers[i];	
		}
		return 0;
	}
	public static void swapNumbers(int first, int second, int[] numbers){
		int temp = numbers[first];
		numbers[first]= numbers[second];
		numbers[second] = temp;
	}
	public static void main(String args[]) {
		int[] input = {3, 1, 9, 6, 12, 24};
		System.out.print(findNumber(input, 3));
	}
}
