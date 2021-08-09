package Top100;

import java.util.Scanner;

public class Finding_integers_with_X_Divisors {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		   int lo= s.nextInt();
		   int hi= s.nextInt();
		   int divisor=s.nextInt();
		   
		   int checkDivisor=0;
		   
		   
		   for(int i=lo; i <= hi; ++i) {
			    int count=0;
			   
			   for(int j=2; j<=i; ++j) {
				   
				   if(i%j==0) {
					   count++;
					   
				   }
			   }
			   
			   if(count==divisor) {
				   checkDivisor++;
			   }
	}
		   
		   System.out.println(checkDivisor);
		   

	}

}
