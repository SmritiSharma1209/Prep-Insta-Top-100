package Top100;

import java.util.Scanner;

public class Maximum_handshakes {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of people");
		int n= s.nextInt();
		
		int handshake= ((n-1) * n)/2 ;
		System.out.println(handshake);

	}

}
