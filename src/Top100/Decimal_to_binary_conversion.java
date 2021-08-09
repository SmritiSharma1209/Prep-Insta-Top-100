package Top100;

import java.util.Scanner;

public class Decimal_to_binary_conversion {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int pow=1;
		int bval=0;
		
		while(n>0) {
			int rem=n%2;
			bval=bval+rem*pow;
			pow=pow*10;
			n=n/2;
			
		}
		System.out.println(bval);
		
		

	}

}
