import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalPermHashSet {
	public static void main(String[] args) {
	 	   Scanner sc = new Scanner(System.in);
	 	   System.out.println("Enter the String");
	 	   String s = sc.nextLine();
	 	   boolean b = isPalperm(s);
	 	   System.out.println("Is the String permutation of a palindrome "+b);
	    }

	private static boolean isPalperm(String s) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(!set.add(s.charAt(i)))
				set.remove(s.charAt(i));
		}
		
		return set.size()<=1;
	}
}
