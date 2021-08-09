package Top100;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=n;
		int count=0;
		int rev=0;
		
		
		while(temp>0) {
			temp=temp/10;
			count++;
		
		}
		
		temp=n;
		
		while(temp>0) {
			int rem=temp%10;
			rev= (int) (rev+ rem* Math.pow(10, count-1));
			temp=temp/10;
			count--;
			System.out.println(rev);
			
		}
		
		if(n==rev) {
			System.out.println(n + " is a palindrome");
		}else {
			System.out.println(n + " is not a palindrome");
		}
		

	}

}
