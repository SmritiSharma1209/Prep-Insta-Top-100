package Top100;

import java.util.Scanner;

public class Palindrome_and_reverse {

	public static void main(String[] args) {
		
       Scanner s= new Scanner(System.in);
		
		String str= s.next();
		String rev="";

		
		for(int i=str.length()-1; i>=0 ;--i) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equals(str)) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("Not palindrome");
		}
	}

}
