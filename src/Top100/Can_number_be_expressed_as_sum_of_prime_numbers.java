package Top100;
import java.util.Scanner;

public class Can_number_be_expressed_as_sum_of_prime_numbers {

	public static void main(String[] args) {
	   Scanner s= new Scanner(System.in);
	   int n= s.nextInt();
	   int x=0;
	   
	   for(int i=0;i<=n/2;++i) {
		   
		   if( isPrime(i) == 1) {
			   
			   if(isPrime(n-i)==1) {
				   System.out.println( n + " = " + i + " + " + (n-i));
				   x=1;
				   break;
				   
			   }
			   
		   }
	   }
	   if(x==0) {
		   System.out.println("No.cannot be expressed as sum of 2 primes.");
	   }
}
	
	public static int isPrime(int n) {
		int c=1;
		
		for(int i=2;i <n;++i) {
			if(n%i==0) {
				c=0;
				break;
			}
		}
		return c;
	}

}
