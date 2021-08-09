package Top100;

import java.util.Scanner;

public class Toogle_String {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String str= s.next();
		String newStr="";
		
		for(int i=0;i<str.length();++i) {
			
			if(Character.isUpperCase(str.charAt(i))) {
				
				newStr= newStr+ Character.toLowerCase(str.charAt(i));
			}else {
				
				newStr=newStr+Character.toUpperCase(str.charAt(i));
			}
			
		}
		System.out.println(newStr);
		
		
	}

}
