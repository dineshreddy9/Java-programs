package permutationstring;

import java.util.Arrays;
import java.util.Scanner;

public class sortPermutation {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string s1");
	String s1 = sc.nextLine();
	System.out.println("enter string s2");
	String s2 = sc.nextLine();
	boolean b = checkPermut(s1,s2);
	System.out.println(b);
    }
	private static boolean checkPermut(String w1, String w2) {
		// TODO Auto-generated method stub
		if(w1.length()!=w2.length()) return false;
		char[] chars1Array = w1.toCharArray();
		char[] chars2Array = w2.toCharArray();
		Arrays.sort(chars1Array);
		Arrays.sort(chars2Array);
		boolean result = Arrays.equals(chars1Array, chars2Array);
		return result;
	}
	
}
