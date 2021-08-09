package Top100;

import java.util.Scanner;

public class DiscountMin {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no.of items");
		int numItems=s.nextInt();
		String item= Details(numItems);
		System.out.println(item);
	
	}
	
	public static String Details(int numItems) {
		float min= Integer.MAX_VALUE;
		String minItem="";
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<numItems;++i) {
			
			String name=s.next();
			int price=s.nextInt();
			int discount=s.nextInt();
			
			float DiscountedPrice=calDiscount(price, discount);
			
		    if(min>DiscountedPrice) {
		    	min=DiscountedPrice;
				minItem=name;
				
			}
			
	}
		return minItem;
	}
	
	public static float calDiscount(int price, int discount) {
		
		float discountPrice= (price*discount)/100;
		return discountPrice;
	}
	


}
