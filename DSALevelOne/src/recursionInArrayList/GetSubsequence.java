package recursionInArrayList;
// Subsequence of string
import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();//abc
		ArrayList<String> result = getSebsequece(s);
		System.out.println(result);
	}
	public static ArrayList<String> getSebsequece(String s) {
		// base case
		if(s.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		char c = s.charAt(0);
		String restOfString = s.substring(1);
		ArrayList<String> res = getSebsequece(restOfString);
		ArrayList<String> rres = new ArrayList<String>();
		for(String ss : res){
			rres.add("" + ss);
			rres.add(c + ss);
		}
		return rres;
	}
}
