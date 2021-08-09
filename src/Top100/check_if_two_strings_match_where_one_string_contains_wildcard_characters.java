package Top100;

import java.util.Scanner;

public class check_if_two_strings_match_where_one_string_contains_wildcard_characters {

	public static void main(String[] args) {
		
		
        Scanner s= new Scanner(System.in);
		
		String str1= s.next();
		String str2=s.next();
		
		boolean isCheck=check(str1,str2);
		if(isCheck==true) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
		


	}
	
	
	public static boolean check(String str1, String str2) {
		
		char ch1[] = str1.toCharArray();
		char ch2[]=str2.toCharArray();
		boolean status=true;
		
		for(int i=0;i<ch1.length;++i) {
			
				if(ch1[i]!=ch2[i]) {
					
					if(ch1[i]=='?' || ch1[i]=='*') {
						
						if(ch1[i+1]!=ch2[i+1]) {
							status=false;
							break;
						}
				}
			
				else if(ch2[i]=='?' || ch2[i]=='*') {
						
						if(ch2[i+1]!=ch1[i+1]) {
							status=false;
							break;
						}
				
			      }
		  }
		
	}
		return status;
}

}
