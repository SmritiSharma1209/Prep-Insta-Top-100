package Top100;

import java.util.Scanner;

public class Remove_all_char_except_alphabet {

	public static void main(String[] args) {
		
		
       Scanner s= new Scanner(System.in);
		
		String str= s.next();
		String newStr="";

		
		for(int i=0;i<str.length(); ++i) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				newStr=newStr+str.charAt(i);
			}
		}
		System.out.println(newStr);
	}

}
