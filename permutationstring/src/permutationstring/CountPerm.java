package permutationstring;

import java.util.Arrays;
import java.util.Scanner;

public class CountPerm {
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
			int[] b1 = new int[128];
			int[] b2 = new int[128];
			for(int i=0;i<w1.length();i++)
				b1[w1.charAt(i)]++;
			for(int j=0;j<w2.length();j++) {
				b1[w2.charAt(j)]--;
				if(b1[w2.charAt(j)]<0)
					return false;
			}
			return true;
		}
}
