package Top100;

import java.util.Scanner;

public class Captalize_first_and_last_of_each_string {

	public static void main(String[] args) {
		
    Scanner scn= new Scanner(System.in);
		
//		String str= s.nextLine();
//		String newStr[]= str.split("\\s");
//		String newstr="";
//		
//		for(String Str: newStr) {
//			
//			 Str= Str.replace(Str.charAt(0), Character.toUpperCase(Str.charAt(0)));
//			 Str=Str.replace(Str.charAt(Str.length()-1), Character.toUpperCase(Str.charAt(Str.length()-1)));
//			 
//			 
//		}
//		
//		System.out.println(newstr);
    
    System.out.print("Enter String : "); 
    String s = scn.nextLine();
    String newstr = "";

    String[] str = s.split("\\s"); // splitting sentence into word converted to String array

   for (String string : str) {     
     int length = string.length();
     String firstchar = string.substring(0, 1);
     String restchar = string.substring(1, length - 1);
     String lastchar = Character.toString(string.charAt(length - 1));
     newstr = newstr+firstchar.toUpperCase()+restchar+" ";
   } 
   System.out.println(newstr);

}
	
}
