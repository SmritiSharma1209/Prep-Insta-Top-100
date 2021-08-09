package Top100;

import java.util.Scanner;

public class Remove_all_brackets {

	public static void main(String[] args) {
		
      Scanner s= new Scanner(System.in);
		
		String str= s.next();
		String newStr="";
		
		newStr=str.replaceAll("[(){}]", "");
		System.out.print(newStr);

	}

}
