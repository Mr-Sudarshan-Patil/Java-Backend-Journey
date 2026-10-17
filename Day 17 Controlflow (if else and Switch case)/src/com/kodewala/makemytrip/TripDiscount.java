package com.kodewala.makemytrip;

/*
 * This class is calculating a Discount
 * */
public class TripDiscount {

	public int getDiscount(String from, String to, int price) {
		
		int maxDiscount; //local variable storing discount value
		
		//Price is less than 5000, 0% Discount
		
		if (price < 5000) {
			// No discount
			maxDiscount = 0;
		} 
		
		//Price between 5000-10000, 10% Discount
		else if (price >= 5000 && price < 10000) 
		{
			// 10% discount
			maxDiscount = price * 10 / 100;
		} 
		else
		{
			// 15% discount, maximum discount is 1250
			int discount = price * 15 / 100;
			if (discount > 1250) 
			{
				maxDiscount = 1250;
			} 
			else 
			{
				maxDiscount = discount;
			}
		}

		return maxDiscount;
}


}
