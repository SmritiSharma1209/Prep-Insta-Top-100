package Top100;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
          
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n =s.nextInt();
		int temp=n;
		int pow=1;
		int dval=0;
		
		while(temp>0) {
			int rem=temp%10;
			dval=dval+rem*pow;
			pow=pow*2;
			temp=temp/10;
			
		}
		
		System.out.print(dval);
		
		


	}

}
