import java.util.HashMap;
import java.util.Scanner;

public class PermHashMap {
	public static void main(String[] args) {
 	   Scanner sc = new Scanner(System.in);
 	   System.out.println("Enter the String");
 	   String s = sc.nextLine();
 	   boolean b = isPalperm(s);
 	   System.out.println("Is the String permutation of a palindrome "+b);
    }

	private static boolean isPalperm(String s) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hmap = new HashMap<>();
		for(int i=0; i<s.length();i++) {
			hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
		}
		int count =0;
		for(char key:hmap.keySet()) {
			count += hmap.get(key)%2;
		}
		
	    return count<=1;
	}
}
