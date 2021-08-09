package Top100;

import java.util.Scanner;

public class Highest_Placement {

	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter max students placed in cse");
		int cse= s.nextInt();
		
		System.out.println("Enter max students placed in ECE");
		int ece= s.nextInt();
		
		System.out.println("Enter max students placed in MTECH");
		int mtech= s.nextInt();
		
		int max= Math.max(Math.max(cse, ece),  mtech);
		if(max==cse) {
			System.out.println("CSE");
		}if(max==ece) {
			System.out.println("ECE");
			
		}if(max==mtech) {
			System.out.println("MTech");
		}
		
		
		
		
		

	}

}
