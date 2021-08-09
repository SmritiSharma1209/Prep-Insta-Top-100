package Top100;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram_string_or_not {

	public static void main(String[] args) {
		
       Scanner s= new Scanner(System.in);
		
		String str1= s.next();
		String str2=s.next();
		
		
		boolean status=Anagram(str1,str2);
		if(status==true) {
			 System.out.println("Anagram");
		}else {
			System.out.println(" Not Anagram");
		}
		
		
		
	}
	
	
	public static boolean Anagram(String s1, String s2) {
		
		char a1[]=s1.toLowerCase().toCharArray();
		char a2[]=s2.toLowerCase().toCharArray();
		
		boolean status=true;
		
		if(a1.length!=a2.length) {
			status=false;
		}
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(a1.equals(a2)) {
			status=true;
		}
		return status;
	}
}
