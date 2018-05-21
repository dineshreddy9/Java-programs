package uniquestring1;

import java.util.Arrays;
import java.util.Scanner;

public class SortUniq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean b = sortChar(s);
		System.out.println(b);
	}

	private static boolean sortChar(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		boolean res=true;
		for(int i=0;i<charArray.length-1;i++) {
			if(charArray[i]!=charArray[i+1])
				continue;
			else
				res = false;
		}
		return res;
	}
	

}
