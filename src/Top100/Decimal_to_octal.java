package Top100;

import java.util.Scanner;

public class Decimal_to_octal {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int pow=1;
		int oval=0;
		
		while(n>0) {
			int rem=n%8;
			oval=oval+rem*pow;
			pow=pow*10;
			n=n/8;
		}
		System.out.println(oval);
		

	}

}
