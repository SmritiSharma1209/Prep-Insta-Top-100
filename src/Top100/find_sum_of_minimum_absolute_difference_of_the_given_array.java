package Top100;

import java.util.Scanner;

public class find_sum_of_minimum_absolute_difference_of_the_given_array {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n;++i) {
			arr[i]=s.nextInt();
		}
		
		quicksort(0,arr.length-1,arr);
		
		System.out.println(absSum(arr));

	}
	
	public static int absSum(int arr[]) {
		
		int x= arr[arr.length/2];
		int sum=0;
		
		for(int i=0;i<arr.length;++i) {
			
			sum=sum+Math.abs(arr[i]-x);
			
		}
		
		return sum;
		
		
		
	}

	
	public static void quicksort(int lo, int hi, int arr[]) {
		
		if(lo>hi) {
			return;
		}
		
		int pivot=arr[hi];
		int PivotPos=partition(lo,hi,pivot,arr);
		quicksort(lo,PivotPos-1, arr);
		quicksort(PivotPos+1, hi, arr);
		
		
		
	}
	
	public static int partition(int lo, int hi, int pivot, int arr[]) {
		
		int i=lo;
		int j=lo;
		
		while(i<=hi) {
			if(arr[i]>pivot) {
				i++;
			}else {
				swap(i,j,arr);
				i++;
				j++;
			}
		}
		
		return j-1;
		
	}
	
	
	public static void swap(int i, int j, int arr[]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
