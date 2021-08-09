package Top100;

import java.util.Scanner;

public class FuelConsumption {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of litres to fill the tank ");
		int l= s.nextInt();
		System.out.println("enter distance covered");
		int d= s.nextInt();
		double avg= (l/d) *100;
		System.out.println(avg);
	
		double miles= d * 0.6214;
		double gallons= l*0.2624;
		System.out.println("miles/gallons");
		System.out.println(miles/gallons);
		

	}

}
