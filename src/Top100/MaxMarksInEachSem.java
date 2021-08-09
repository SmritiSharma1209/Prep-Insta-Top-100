package Top100;
import java.util.Scanner;

public class MaxMarksInEachSem {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter No.of Semesters");
		int num=s.nextInt();
		System.out.println("Enter no of subjects in each semester");
		int sem1=s.nextInt();
		int sem2=s.nextInt();
		int sem3=s.nextInt();
		
		System.out.println("Enter marks in sem1 ");
		int sem1Marks[]=marks(sem1);
		
		System.out.println("Enter marks in sem2 ");
		int sem2Marks[]=marks(sem2);
		
		System.out.println("Enter marks in sem3 ");
		int sem3Marks[]=marks(sem3);
		
		sort(sem1Marks,0, sem1-1);
		sort(sem2Marks,0, sem2-1);
		sort(sem3Marks,0, sem3-1);
		
		System.out.println("Max marks in sem1 " + sem1Marks[sem1-1]);
		System.out.println("Max marks in sem2 " + sem2Marks[sem2-1]);
		System.out.println("Max marks in sem3 " + sem3Marks[sem3-1]);
		
		
		
		

	}
	
	
        public static int[] marks(int numofSubjects) {
		
		Scanner s= new Scanner(System.in);
		int marks[]= new int[numofSubjects];
		for(int i=0;i <numofSubjects; ++i) {
			marks[i]=s.nextInt();
		}
		return marks;
	}

	
	    
	
          public static void sort(int arr[], int lo, int hi) {
           
        	  if(lo>hi) {
        	    return;
        	  }
       	  
        	  int pivot=arr[hi];
        	  
        	  int pivotPos=partition(arr, pivot,lo, hi);

        	  sort(arr, lo, pivotPos-1);
        	  sort(arr,pivotPos+1, hi);
        	  
          }
          
          public static int partition(int arr[], int pivot, int lo, int hi) {
        	  
        	  int i=lo; 
        	  int j=lo;
        	  
        	  
        	  while(i<=hi) {
        		  if(arr[i]>pivot) {
        			  i++;
        		  }
        		  else {
        			  swap(arr,i,j);
        			  i++;
        			  j++;
        		  }
            }
        	  
        	  return j-1;
       }
	
          public static void swap(int arr[], int i, int j) {
           	  int temp=arr[i];
           	  arr[i]=arr[j];
           	  arr[j]=temp;
             }
             

	
}
