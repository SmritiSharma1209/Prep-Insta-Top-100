package Top100;

import java.util.Scanner;
import java.util.ArrayList;

public class Commmon_subSequence {

	public static void main(String[] args) {
		
       Scanner s= new Scanner(System.in);
		
		String str1= s.next();
		String str2=s.next();
		
		ArrayList<String> substr1= subsequence(str1);
		ArrayList<String> substr2= subsequence(str2);
		ArrayList<String> common=new ArrayList<>();
		
			if(substr1.size()>substr2.size()) {
				
				for(String item:substr2) {
					
					if(substr1.contains(item)) {
						
						common.add(item);
						
					}
				}
			}
			
			for(String newItem : common) {
				System.out.print(newItem + " ");
			}
			
	}
	
	public static ArrayList subsequence(String str) {
		
		if(str.length()==0) {
			ArrayList<String>bres= new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		
		
		char ch=str.charAt(0);
		
		String ros= str.substring(1);
		ArrayList<String> res = subsequence(ros);
		
		ArrayList<String> mes= new ArrayList<>();
		
		for(String rstr : res) {
			mes.add(""+rstr);
			mes.add(ch+rstr);
		}
		return mes;
		
		
	}

}
