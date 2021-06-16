package recursionInArrayList;
//Keypad Combination 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetKeypadCombination {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();
		ArrayList<String> result = getKeypadCombination(s);
		System.out.println(result);
		
	}
	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	public static ArrayList<String> getKeypadCombination(String s){
		//base case
		if(s.length() == 0) {
			ArrayList<String> ress = new ArrayList<>();
			ress.add("");
			return ress;
		}
		char c = s.charAt(0);
		String rem = s.substring(1);
		
		ArrayList<String> res = getKeypadCombination(rem);
		ArrayList<String> finalRes = new ArrayList<>();
		
		String forCharC = codes[c-'0'];
		for(int i=0; i<forCharC.length(); i++){
			char ch = forCharC.charAt(i);
			for(String ss : res) {
				finalRes.add(ch + ss);
			}
		}
		return finalRes;
	}
}
