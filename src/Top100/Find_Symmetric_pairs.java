package Top100;

import java.util.Scanner;
import java.util.HashMap;

public class Find_Symmetric_pairs {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		
		int arr[][]= new int[n][2];
		
		for(int i=0; i<arr.length;++i) {
			for(int j=0; j<arr[0].length;++j) {
				arr[i][j]=s.nextInt();
				
			}
		}
		
		
		findSymmetric(arr);
		
	}
	
	public static void findSymmetric(int arr[][]) {
		
//		HashMap<Integer, Integer> hashmap= new HashMap<Integer, Integer>();
//		
//		
//		   for(int i=0;i<arr.length;++i) {
//			   
//			   int first=arr[i][0];
//			   int second= arr[i][1];
//			   
//			   
//			   Integer val= hashmap.get(second);
//				
//			   
//			   if(val!=null && val==first) {
//				   System.out.println("Symmetric Pair " + first + " " + second);
//				   
//				}else {
//					hashmap.put(first, second);
//				}
//		}
//		   
		   for(int i=0 ;i<arr.length; ++i) {
			   
			   int first=arr[i][0];
			   int second=arr[i][1];
			   
			   for(int k=0;k<arr.length;++k) {
				  
				   if(first==arr[k][1]) {
					   
					   if(second ==arr[k][0]) {
						   
						   System.out.println("Symmetric Pair" + arr[k][0] + " " + arr[k][1]);
					   }
					   
				   }
			   }
		   }
		
	}

}
