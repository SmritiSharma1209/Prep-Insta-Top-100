package Top100;
import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     int n= s.nextInt();
     int temp=n;
     int count=0;
     int newNum=0;
     
     while(temp!=0) {
    	 temp=temp/10;
    	 count++;
     }
//    System.out. println(count);     
     
     while(n!=0) {
    	 int rem=n%10;
    	 newNum+= rem*Math.pow(10, count-1);
    	 --count;
    	 n=n/10;
    	 
    }
     System.out.println(newNum);
   
    

	}

}
