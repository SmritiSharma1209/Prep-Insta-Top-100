package Top100;

import java.util.Scanner;

public class Disjoint_array {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m=s.nextInt();
		boolean isDisjoint=true;
		
		int arr1[]= new int[n];
		int arr2[]=new int[m];
		
		for(int i=0; i<n;++i) {
			arr1[i]=s.nextInt();
		}
		
		for(int i=0; i<m;++i) {
			arr2[i]=s.nextInt();
		}
		
		disjoint(arr1,arr2);
	     
		
	}		
		
	
	public static void disjoint(int arr1[], int arr2[]) {
		
		boolean isDisjoint=true;
			
			if(arr1.length>=arr2.length) {
				
				for(int i=0;i<arr1.length;++i) {
					for(int j=0;j<arr2.length;++j) {
						
						if(arr1[i]==arr2[j]) {
							
							isDisjoint=false;
							break;
						}
					}
				}
				
			}
			else {
				
				for(int j=0; j<arr2.length;++j) {
					
					for(int i=0;i<arr1.length;++i) {
						
						if(arr2[j]==arr1[i]) {
							isDisjoint=false;
							break;
							
						}
					}
					
				}
			}
			

			if(isDisjoint==true) {
				System.out.println("Disjoint");
			}else {
			System.out.println("Not Disjoint");
			}
			
	}



	}


