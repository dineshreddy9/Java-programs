import java.util.Scanner;

public class StringCompress {
	public static void main(String[] args) {
	 	   Scanner sc = new Scanner(System.in);
	 	   System.out.println("Enter String1");
	 	   String s1 = sc.nextLine();
	 	   String s = compressString(s1);
	 	   System.out.println("Compressed String is "+s);
	    }

	private static String compressString(String s2) {
		// TODO Auto-generated method stub
		int consecutiveCount = 0;
		StringBuilder compressedString = new StringBuilder();
		if(s2==null)
			return null;
		for(int i=0;i<s2.length();i++) {
			consecutiveCount++;
			if(i+1>=s2.length()||(s2.charAt(i)!=s2.charAt(i+1))) {
				compressedString.append(s2.charAt(i));
				compressedString.append(consecutiveCount);
				consecutiveCount = 0;
			}
			
		}
		return compressedString.length()<s2.length()?compressedString.toString():s2;
	}

}
