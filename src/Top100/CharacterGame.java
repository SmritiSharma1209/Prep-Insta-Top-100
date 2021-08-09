package Top100;
import java.util.Scanner;

public class CharacterGame {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no of items");
		int n= s.nextInt();
		int num[]= new int[n];
		
		
		for(int i=0 ;i<n;++i) {
			num[i] =s.nextInt();
		}
		
		for(int i=0 ;i<num.length; ++i) {
			
			char data= (char)num[i];
			System.out.println(num[i] + "- " + data);
		}
		
		

	}

}
