package Top100;
import java.util.Scanner;

public class Binary_to_octal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enetr the binary number");
		int n= s.nextInt();
		
		int decimalnum= toDecimal(n,2);
		int octalnum= toOctal(decimalnum,8);
		System.out.println(octalnum);

	}
	
	public static int toDecimal(int n , int base) {
		
		int pow=1;
		int dval=0;
		
		while(n>0) {
			int rem=n%10;
			dval=dval+rem*pow;
			pow=pow*2;
			n=n/10;
		}
		return dval;
		
	}


    public static int toOctal(int n , int base) {
    	
    	int onum=0;
    	int pow=1;
    	
    	while(n>0) {
    		int rem=n%base;
    		onum=onum+rem*pow;
    		pow=pow*10;
    		n=n/base;
      }
    	return onum;
	   
   }

}


