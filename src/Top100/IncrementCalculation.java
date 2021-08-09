package Top100;

import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the salary");
		float sal= s.nextInt();
		System.out.println("Enter the Perforamce appraisal rating");
		float rating= s.nextFloat();
	    float incrementSalary=0;
		
		if(sal<=0 || rating< 1 || rating >5 ) {
			System.out.println("Invalid Input");
		}else {
		
		if( rating >= 1 && rating <=3 ) {
			incrementSalary= sal + ((sal*10)/100);
			System.out.println(incrementSalary);
		}
		
		else if( rating>=3.1 && rating <=4 ) {
			incrementSalary= sal + ((sal*25)/100);
			System.out.println(incrementSalary);

		}
		else if( rating>=4.1 && rating <=5 ) {
			incrementSalary= sal + ((sal*30)/100);
			System.out.println(incrementSalary);
		}
	}
	}

}
