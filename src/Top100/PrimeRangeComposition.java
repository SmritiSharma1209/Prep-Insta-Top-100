package Top100;
import java.util.Scanner;

public class PrimeRangeComposition {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int lo=s.nextInt();
		int hi=s.nextInt();
		
		
		
		if(lo>hi || lo<0) {
			System.out.println("Invalid Input");
		}else {
			
			for(int i=lo;i<=hi; ++i) {
				int count=0;
				
				for(int j=2; j<i; ++j) {
					
					if(i%j==0) {
						++count;
						
					}
				
				}
				
				if(count==0) {
					System.out.println(i);
					
				}
			}
		}
		

	}

}
