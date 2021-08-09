package Top100;

import java.util.Scanner;

public class Sort_half_ascending_half_descending {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n;++i) {
			arr[i]=s.nextInt();
		}
		
		quickSort(0, arr.length-1, arr);
		halfDescending(arr.length/2, arr.length-1 , arr);
		
	    for(int i=0; i<arr.length;++i) {
	    	System.out.print(arr[i]+ " ");
	    }


	}
	
	public static  void halfDescending(int lo, int hi, int arr[]) {
		int last=hi;
		
		
		for(int i=lo; i < hi; ++i) {
			
			int temp=arr[i];
			arr[i]=arr[last];
			arr[last]=temp;
			
			--last;
			
		}
		
	}
	
	
	public static void quickSort(int lo, int hi, int arr[]) {
		
		if(lo>hi) {
			return ;
		}
		
		int pivot=arr[hi];
		int PivotPos=partition(lo,hi,pivot, arr);
		quickSort(lo,PivotPos-1, arr);
		quickSort(PivotPos+1, hi, arr);
		
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
