package oneeditaway;

import java.util.Scanner;

public class OneEditDistance {
	public static void main(String[] args) {
	 	   Scanner sc = new Scanner(System.in);
	 	   System.out.println("Enter String1");
	 	   String s1 = sc.nextLine();
	 	   System.out.println("Enter String2");
	 	   String s2 = sc.nextLine();
	 	   boolean b = checkEdit(s1,s2);
	 	   System.out.println("Are the Strings one edit or zeroedits away "+b);
	    }

	private static boolean checkEdit(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()==s2.length()) {
			return oneReplace(s1,s2);
		}
		else if((s1.length()+1)==s2.length()) {
			return oneInsert(s1,s2);
		}
		else if(s1.length()==(s2.length()+1)){
			return oneInsert(s2,s1);
		}
		return false;
	}

	private static boolean oneInsert(String s1, String s2) {
		// TODO Auto-generated method stub
		int indexs1 = 0;
		int indexs2 = 0;
		while(indexs1<s1.length()&&indexs2<s2.length()) {
			if(s1.charAt(indexs1)!=s2.charAt(indexs2)) {
				if(indexs1!=indexs2) {
					return false;
				}
				indexs1++;
			}
			else {
				indexs1++;
				indexs2++;
			}
		}
		return true;
	}

	private static boolean oneReplace(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean oneDifference = false;
		int indexs1 = 0;
		int indexs2 = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				if(oneDifference) {
					return false;
				}
				oneDifference = true;
			}
		}
		return true;
	}
	
}
