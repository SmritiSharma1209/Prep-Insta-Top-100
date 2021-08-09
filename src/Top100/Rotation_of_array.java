package Top100;

import java.util.Scanner;

public class Rotation_of_array {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int n= s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;++i) {
			arr[i]= s.nextInt();
			
		}
		System.out.println("enter the rotation");
		int k= s.nextInt();
		
		rotate(arr, k);
		for(int i=0;i<arr.length;++i){
			System.out.print(arr[i]+ " ");
			
		}

	}
	
	public static void rotate(int arr[], int k) {
		
		int count=arr.length;
		
		if(k<count) {
			k=k+count;
		}
		k=k%count;
		
		while(k!=0) {
			
			int first=arr[0];
			
			for(int i=0;i<arr.length-1;++i) {
			   arr[i]=arr[i+1];
			}
			
			arr[arr.length-1]=first;
			
			k--;
		}
		
	}

}
