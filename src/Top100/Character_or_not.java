package Top100;

import java.util.Scanner;

public class Character_or_not {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		   int n  =(int) s.next().charAt(0);
		   
		   if( ( n>=65 && n<=90) || ( n>=97 && n<=122)) {
			   System.out.println("Charcter");
		   }else {
			   System.out.println("Not Character");
		   }
		   
		   

	}

}
