package Top100;

import java.util.Scanner;

public class Permutations_in_which_people_occupy_the_seats {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the  number of people");
		int n= s.nextInt();
		System.out.println("Enter the number of Seats");
		int r= s.nextInt();
		int factn=factorial(n);
		int factr=factorial(n-r);
		int seating=factn/factr;
		System.out.println(seating + " ways");
	}

	
	public static int factorial(int n) {
		int mul=1;
		
		while(n>0) {
			mul=mul*n;
			n=n-1;
		}
		return mul;
	}
}
