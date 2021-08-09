package Top100;

import java.util.Scanner;

public class Counting_days_in_month_of_year {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		   int year  = s.nextInt();
		   int month=s.nextInt();
		   boolean isLeap=false;
		   
		   
		   if( (year % 4 == 0 && year % 100!=0) || year % 400 == 0){
			   isLeap=true;
			   
		  }
		   
		   if(month== 1 || month== 3 || month== 5 ||month== 7 || month== 8 ||month== 10 || month== 12) {
			   System.out.println("Days=31");
		   }
		   else if(month== 4 || month== 6 ||month== 9 ||month== 11) {
			   System.out.println("Days= 30 ");
		   } 
		   else{ 
			   if(isLeap==true) {
				   System.out.println("Days=29");
			   }else {
				   System.out.println("Days=28");
			   }
		   }
	}

}
