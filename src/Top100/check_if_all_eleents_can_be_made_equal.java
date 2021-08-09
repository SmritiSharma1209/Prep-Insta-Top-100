package Top100;

import java.util.Scanner;

public class check_if_all_eleents_can_be_made_equal {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n;++i) {
			arr[i]=s.nextInt();
		}
		
		if(equalNum(arr)==true) {
			System.out.println("Can be expressed");
		}else{
			System.out.println("Cannot be expressed");
		}
		
		
				
  }
	
	
	public static boolean equalNum(int arr[]) {
		
		boolean isEqual=true;
		
		for(int i=0;i<arr.length;++i) {
			
			while(arr[i]%2==0) {
				arr[i]=arr[i]/2;
			}
			
			while(arr[i]%3==0) {
				arr[i]=arr[i]/3;
			}
		}
		
		
		for(int i=arr.length-1; i>0; --i) {
			
			if(arr[i]!=arr[i-1]) {
				
				isEqual=false;
				break;
			}
			
		}
		return isEqual;


	}


}
