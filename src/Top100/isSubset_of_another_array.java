package Top100;

import java.util.Scanner;

public class isSubset_of_another_array {

	public static void main(String[] args) {
	
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m =s.nextInt();
		
		int arr1[]= new int[n];
		int arr2[]=new int[m];
		
		for(int i=0; i<n;++i) {
			arr1[i]=s.nextInt();
		}
		
		for(int i=0; i<m;++i) {
			arr2[i]=s.nextInt();
		}
		
		if(isSubset(arr1,arr2)==true) {
			System.out.println(" Is Subset");
		}else {
			System.out.println("Is not subset");
		}
		

	}

	
	
	public static boolean isSubset(int arr1[], int arr2[]) {
		
		int i=0;
		int j=0;
		
	
			for( i=0;i<arr2.length;++i) {
				
				for( j=0;j<arr1.length;++j) {
					
					if(arr2[i]==arr1[j]) {
					  break;
					}
				}
				
				if(j==arr1.length) {
					return false;
				
			}
		}
			return true;
	}
}
