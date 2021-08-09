package Top100;

import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=n;
		int count=0;
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		temp=n;
		
		
		

	}
	
	public static void calculate(int n , int count) {
		
		String str="";
		int num=0;
	
	 while(count!=0) {
			
			int div= (int)Math.pow(10, num+1);
			n = n%div;
			if(n>0 && n<25)
			str= str+ (char)n;
			num++;
			n=n/div;
			count--;
			
		}
		
	}

}
