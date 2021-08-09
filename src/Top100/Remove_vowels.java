package Top100;

import java.util.Scanner;

public class Remove_vowels {

	public static void main(String[] args) {
	
        Scanner s= new Scanner(System.in);
		
		String str= s.next();
		String newStr="";
		
		for(int i=0;i<str.length(); ++i) {
			
			if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u') {
				newStr=newStr+str.charAt(i);
			}
		}
		System.out.println(newStr);
		
		

	}

}
