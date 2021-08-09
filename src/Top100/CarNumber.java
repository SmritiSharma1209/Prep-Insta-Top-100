package Top100;

import java.util.Scanner;

public class CarNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the car number");
		int n= s.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0) {
			int rem=temp%10;
			sum+=rem;
			temp=temp/10;
		}
		
		if(sum % 3 == 0  || sum % 5 == 0 || sum % 7 == 0) {
			System.out.println(n +" is a lucky number");
			
		}else {
			System.out.println(n + " is not a lucky number");
		}
		


	}

}
