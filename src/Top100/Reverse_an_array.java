package Top100;
import java.util.Scanner;

public class Reverse_an_array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n;++i) {
			arr[i]=s.nextInt();
		}
		
		int newArr[]=Reverse(arr);
		for(int i=0;i<newArr.length;++i){
			System.out.print(newArr[i] +" ");
		}

	}

	
	
	public static int[] Reverse(int arr[]) {
		int hi =arr.length-1;
		
		for(int i=0;i<arr.length/2; ++i) {
			
			int temp=arr[i];
			arr[i]=arr[hi];
			arr[hi]=temp;
			
			hi--;
		}
		
		return arr;
	}
}
