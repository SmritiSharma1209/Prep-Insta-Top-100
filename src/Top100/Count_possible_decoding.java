package Top100;
import java.util.Scanner;

public class Count_possible_decoding {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String str= "123";
	       char[] dig= str.toCharArray();
	       System.out.println(cnt_decoding_digits(dig, 6));
	}
	
	
	
	   public static int cnt_decoding_digits(char[] dig, int a)
	    {
	        int cnt[] = new int[a+ 1];
	         cnt[0] = 1;
	         cnt[1] = 1;
	    
	         for (int k = 2; k<=a; k++) 
	         { 
	             cnt[k] = 0; 
	             cnt[k] = cnt[k-1];
	             
	             if(k<4) {
	            	 
	             if (dig[k-2] == '1' || (dig[k-2] == '2' && dig[k-1] < '7') )
	                  cnt[k] += cnt[k-2];
	             
	             }
	         }
	         return cnt[a];
	    }

}
