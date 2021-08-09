package Top100;

import java.util.Scanner;

public class Octal_toDecimal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int pow=1;
		int dval=0;
		
		while(n>0) {
			int rem=n%10;
			dval=dval+rem*pow;
			pow=pow*8;
			n=n/10;
		}
		
		System.out.println(dval);

	}

}
