import java.util.Scanner;

public class Palperm {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter the String");
    	   String s = sc.nextLine();
    	   boolean b = isPalperm(s);
    	   System.out.println("Is the String permutation of a palindrome "+b);
       }

	private static boolean isPalperm(String s) {
		// TODO Auto-generated method stub
		int[] asciiArray = new int[128];
		int singleCount = 0;
		for(int i=0;i<s.length();i++) {
			asciiArray[(int) s.charAt(i)]++;
		}
		for(int i=0;i<128 && singleCount<=1;i++) {
			if((asciiArray[i]%2)==1)
				singleCount++;
		}
		if(singleCount==1||singleCount==0)
		    return true;
		else 
			return false;
	}
}
