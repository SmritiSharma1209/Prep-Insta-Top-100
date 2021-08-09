package Top100;

import java.util.Scanner;

public class Equilibrium_index_of_an_array {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;++i) {
			arr[i]= s.nextInt();
			
		}
		
		//quicksort(0,arr.length-1,arr);
		System.out.println(equilibrium(arr));
		

	}
	
	public static int equilibrium(int arr[]) {
		
		int i=0;
		int j= arr.length-1;
		int sum1=0;
		int sum2=0;
		
		while( i<arr.length && j>=0 ) {
			
			sum1=sum1+arr[i];
			sum2=sum2+arr[j];
			
			if(sum1==sum2) {
				break;
			}
			
			i++;
			j--;
		}
		
		return i+1;
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
