package uniquestring1;

import java.util.Scanner;

public class Uniquestr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		boolean res = uniqCheck(s);
		System.out.println(res);
		sc.close();
	}

	private static boolean uniqCheck(String s) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
					flag = false;
			}
		}
		return flag;
	}
}
