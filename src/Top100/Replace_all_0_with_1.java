package Top100;

import java.util.Scanner;

public class Replace_all_0_with_1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
	    String str= Integer.toString(n);
	    String str1="";
	    
	    for(int i= 0;i<str.length(); ++i) {
	    	
//	    	if(str.charAt(i)==0) {
//	    		str.replace('0', '1');
//	    	}
	    	
	    	if(str.charAt(i)=='0') {
	    		str1=str1+'1';
	    		
	    	}else {
	    		str1=str1+str.charAt(i);
	    	}
	    }
	    
	    System.out.println(str1);
	    
	    
	   
	    
		
		
		

	}

}
