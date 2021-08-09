package Top100;

import java.util.Scanner;

public class Frequecy_of_characters {

	public static void main(String[] args) {
		
        Scanner s= new Scanner(System.in);
		
		String str= s.next();
		
		
		for(int i=0;i<str.length()-1;++i) {
			
			int count=1;

			char ch=str.charAt(i);
			
			for(int j=i+1;j<str.length();++j) {
				
				if(ch==str.charAt(j)) {
					count++;
					break;
				}
			}
			
			if(ch!=' ') {
			System.out.println(ch +" - " + count);
			}
			str=str.replace(ch, ' ');
		
		}


	}

}
