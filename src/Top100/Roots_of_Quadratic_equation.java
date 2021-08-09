package Top100;

import java.util.Scanner;

public class Roots_of_Quadratic_equation {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		   int a  = s.nextInt();
		   int b= s.nextInt();
		   int c=s.nextInt();
		   
		   
		   int D=determinant(a,b,c);
		   
		   int x1= (-b + (int)(Math.pow(D, 0.5))) /2*a;
		   int x2= (-b - (int)(Math.pow(D, 0.5))) /2*a; 
		   System.out.println(x1 + " " + x2);

	}
	
	public static int determinant(int a, int b, int c) {
		
		int d= (b*b) - (4*a*c);
		return d;
	}
	
	

}
