package Top100;

import java.util.Scanner;

public class Addition_of_two_fractions {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int x=0;
		int num1= s.nextInt();
		int den1=s.nextInt();
		
				
		int num2=s.nextInt();
		int den2=s.nextInt();
		
		int newnum= num1*den2+ num2*den1;
		int newden= den1*den2;
		
		
		if(newnum>newden) {
			x=newden;
		}else {
			x=newnum;
		}
		System.out.println(x);
		
		for(int i=2;i<=x;++i) {
			
			while(newnum % i==0 && newden % i==0) {
				
				newnum=newnum/i;
				newden=newden/i;
			}
		}
		
		System.out.println( newnum + " / " + newden);
	
		

	}

}
