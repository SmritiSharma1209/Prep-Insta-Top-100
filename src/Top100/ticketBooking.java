package Top100;

import java.util.Scanner;
public class ticketBooking {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of tickets");
		int tickets= s.nextInt();
		System.out.println("Do you want to have refreshment");
		char refresh= s.next().charAt(0);
		System.out.println("Do you have coupon code");
		char coupon= s.next().charAt(0);
		System.out.println("Enter the circle");
		char circle= s.next().charAt(0);
		
		double cost=calculate(tickets, refresh, coupon, circle);
		System.out.println("ticket Cost " + cost);

	}
	
	public static double calculate(int tickets, char refresh, char coupon, char circle) {
		double cost=0.0;
		
		if(tickets>5 && tickets<40) {
		
		if(circle=='k') {
			cost=tickets*75;
		}else {
			cost= tickets*150;
		}
		
		if(tickets>20 && tickets<40) {
			cost= cost- ((cost*10)/100);
		}
		
		if(coupon=='y') {
			cost= cost- ((cost*2)/100);
		}
		
		if(refresh=='y') {
			cost= cost +50*tickets;
		}
		
	}
	else {
		System.out.println("Enter valid ticket range");
	}
		return cost;
}

}
