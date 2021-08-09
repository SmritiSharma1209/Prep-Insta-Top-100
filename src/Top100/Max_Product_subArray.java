package Top100;

import java.util.Scanner;
import java.util.ArrayList;

public class Max_Product_subArray {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n;++i) {
			arr[i]=s.nextInt();
		}
		
		 int max=subArray(arr);
	     System.out.println(max);

	}

	
	public static int subArray(int arr[]) {
		ArrayList<Integer> product  =new ArrayList<Integer>();
		int mul=1;
		int max= Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;++i) {
			int temp=i;
			while(temp<arr.length) {
			
			for(int k=i;k<=temp; ++k) {
				
				mul=mul*arr[k];
				//System.out.print(arr[k] + " ");
				
		   }
			product.add(mul);
			mul=1;
			temp++;
			System.out.println();
		}
	}
		
	for(int i=0;i<product.size(); ++i) {
			
			if(max<product.get(i)) {
				max=product.get(i);
			}
		}
		
		return max;
		
	}
}
