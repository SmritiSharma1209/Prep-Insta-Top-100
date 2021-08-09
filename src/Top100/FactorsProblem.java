package Top100;
import java.util.Scanner;

public class FactorsProblem {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=n;
		
		for(int i=2;i<=n; ++i) {
			while(temp%i==0) {
				temp=temp/i;
				System.out.print(i + " ");
			}
		}

	}

}
