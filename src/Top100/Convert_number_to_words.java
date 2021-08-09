package Top100;

import java.util.Scanner;

public class Convert_number_to_words {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		   int n  = s.nextInt();
		   int temp=n;
		   int count=0;
		   
		   
		   while(temp>0) {
			   temp=temp/10;
			   count++;
		   }
		   
		   
		  String place=" ";
		  String num=" ";
		  String words=" ";
		  
		  while(count>0) {
			  temp= (int) (n/ Math.pow(10, count-1));
			  
		  switch(temp){
		 
		     case 1: num="One ";
		             break;
		     case 2: num="Two ";
		             break;
		     case 3: num="Three ";
		             break;
		     case 4: num="Four ";
		             break;
		     case 5: num="Five ";
		             break;
		     case 6: num="Six ";
		             break;
		     case 7: num="Seven ";
		             break;
		     case 8: num="Eight ";
		             break;
		     case 9: num="Nine ";
		             break;
		     
		  }
		  
		  
		  if(count!=2) {
		  
		       switch(count) {
		  
		          case 4: place= "Thousand ";
		                  break;
		          case 3: place="Hundred ";
		                  break;
		          case 1: place=" ";
		                  break;
		          }
		  
		       words=words+num+place;
	      }
		    
		    else if(count==2) {
			       place= num+"ty ";
			       words=words+place;
		       }
	
		   n= (int)(n% Math.pow(10, count-1));
		  count--;
		  
     }
		  
		  System.out.println(words);

	}

}
