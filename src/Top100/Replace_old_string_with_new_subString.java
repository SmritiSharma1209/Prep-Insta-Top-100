package Top100;

import java.util.Scanner;

public class Replace_old_string_with_new_subString {

	public static void main(String[] args) {
		
    Scanner s= new Scanner(System.in);
		
		String str= s.next();
		String oldstr=s.next();
		String changestr=s.next();
		
		String newStr= str.replace(oldstr, changestr);
		System.out.println(newStr);


	}
	

}
