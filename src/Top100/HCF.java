package Top100;
import java.util.Scanner;

public class HCF {
	
	public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
		int n1= s.nextInt();
		int n2= s.nextInt();
		int temp1=n1;
		int temp2=n2;
		int gcf=0;
		
		if(n1>n2) {
			
			while(n1%n2!=0) {
				int rem=n1%n2;
				n1=n2;
				n2=rem;
				gcf=n2;
			}
		}else if(n2>n1) {
			while(n2%n1!=0) {
				int rem=n2%n1;
				n2=n1;
				n1=rem;
				gcf=n1;
			}
			
		}
		System.out.println(gcf);
		int lcm= (temp1*temp2)/gcf;
		System.out.println(lcm);
		
		
		
	}

}
