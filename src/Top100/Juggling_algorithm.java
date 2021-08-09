package Top100;

import java.util.Scanner;

public class Juggling_algorithm {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;++i) {
			arr[i]= s.nextInt();
			
		}
		
		System.out.println("enter roatations");
		int k= s.nextInt();
		
		int gcf=gcd(n,k);
		System.out.println(gcf);
		rotate(gcf,arr);
		for(int i=0;i<arr.length;++i) {
			System.out.print(arr[i]+ " ");
		}

	}
	
	
	public static void rotate(int gcf, int arr[]) {
		
		
		
		for(int i=0;i<gcf; ++i) {
			
		 int k=gcf;
		
		 while(k!=0) {
			
		   int first=arr[i];
		
		 for(int j=i;j<arr.length-gcf+i;j=j+gcf) {
			
			arr[j]=arr[j+gcf];
		}
		
		arr[arr.length-gcf+i]=first;
		k--;
		
	   }
	}
	}
	
	
	
	public static int gcd(int n1,int n2) {
		
		while(n1%n2!=0) {
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		
		int gcf=n2;
		
		return gcf;
		
		
		
		
	}

}
