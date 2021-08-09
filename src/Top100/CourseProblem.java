package Top100;

import java.util.Scanner;
public class CourseProblem {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no of courses");
		int n= s.nextInt();
		if(n==0) {
			System.out.println("Enter the valid range");
		}
		
		String course[]= new String[n];
		for(int i=0;i<n;++i) {
			course[i]=s.next();
		}
		
		
		System.out.println("Enter the course to be searched");
		String courseName=s.next();
		
		for(int i=0;i<course.length;++i) {
			
			if(course[i].equals(courseName)) {
				System.out.println( courseName + " available");
				break;
			}
			else {
				System.out.println(courseName +" not available");
				break;
			}
		}
		

	}

}
