import java.util.Scanner;

public class Urlify {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter the String with spaces");
    	   String s = sc.nextLine();
    	   System.out.println("Enter the length of string");
    	   int len = sc.nextInt();
    	   String s1 = stringReplace(s,len);
    	   System.out.println(s1);
       }

	private static String stringReplace(String s, int len) {
		// TODO Auto-generated method stub
		int countSpace = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				countSpace++;
		}
		int newLength = len + (2*countSpace);
		//System.out.println(newLength);
		char[] charArray = new char[newLength+1];
		charArray[newLength] = '\0';
		int j=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				charArray[j++]='%';
				charArray[j++]='2';
				charArray[j++]='0';
			}
			else
				charArray[j++]=s.charAt(i);
		}
		//for(int i=0;i<charArray.length;i++)
			//System.out.print(charArray[i]);
		String s3 = String.valueOf(charArray);
		return s3;
	}
       
}
