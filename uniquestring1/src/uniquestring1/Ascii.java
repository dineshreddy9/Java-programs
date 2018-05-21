package uniquestring1;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b;
		String s = sc.nextLine();
		b = checkAscii(s);
		System.out.println(b);
	}

	private static boolean checkAscii(String s) {
		// TODO Auto-generated method stub
		if(s.length()>256) return false;
		boolean[] boolArray = new boolean[256];
		for(int i=0;i<s.length();i++) {
			int ascval = s.charAt(i);
			if(boolArray[ascval])
				return false;
			else
				boolArray[ascval]=true;
		}
		return true;
	}

}
