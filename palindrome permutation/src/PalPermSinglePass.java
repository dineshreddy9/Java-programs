import java.util.Scanner;

public class PalPermSinglePass {
	public static void main(String[] args) {
	 	   Scanner sc = new Scanner(System.in);
	 	   System.out.println("Enter the String");
	 	   String s = sc.nextLine();
	 	   boolean b = isPalperm(s);
	 	   System.out.println("Is the String permutation of a palindrome "+b);
	    }

	private static boolean isPalperm(String s) {
		// TODO Auto-generated method stub
		int[] ascii = new int[128];
		int count=0;
		for(int i=0;i<s.length();i++) {
			ascii[s.charAt(i)]++;
			if(ascii[s.charAt(i)]%2==0)
				count--;
			else
				count++;
		}
		return count<=1;
	}
}
