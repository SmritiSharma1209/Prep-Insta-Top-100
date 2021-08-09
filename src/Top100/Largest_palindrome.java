package Top100;

import java.util.Scanner;

public class Largest_palindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int num=0;
		int n= s.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n;++i) {
			arr[i]=s.nextInt();
		}

		
		quicksort(0,arr.length-1,arr);
		
		
		for(int i=arr.length-1; i>=0; --i) {
			
			boolean isPalindrome=reverse(arr[i]);
			if(isPalindrome==true) {
				num=arr[i];
				break;
				
			}
		}
		System.out.println(num);
			

	}
	
	
	   public static boolean reverse(int n) {
		   
		   boolean isPalindrome=false;
		   int temp=n;
		   int count=0;
		   int rev=0;
		   
		   while(temp>0) {
			   temp=temp/10;
			   count++;
		   }
		   
		   temp=n;
		   
		   while(n>0) {
			   
			   int rem=n%10;
			   rev= rev+ (int) (rem*Math.pow(10, count-1));
			   count--;
			   n=n/10;
		   }
		   
		   
		  if(rev==temp) {
			  isPalindrome=true;
		  }
		  
		  return isPalindrome;
		  
}
	
	   public static void quicksort(int lo, int hi, int arr[]) {
		   if(lo>hi) {
			   return ;
		   }
		   
		   int pivot= arr[hi];
		   int PivotPos=partition(lo,hi,pivot,arr);
		   quicksort(lo, PivotPos-1, arr);
		   quicksort(PivotPos+1, hi,arr);
	   }
	   
	   
	   public static int partition(int lo, int hi, int pivot, int arr[]) {
		   int i= lo;
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
