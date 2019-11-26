// exercise from book, Gaddis. Joe & stocks 


public class Gaddis03 {
	
	public static void main(String[] args) {
		
		int purchasedShares = 1000; 
		double pricePerShare = 32.87; 
		double commision = 0.02; 
		
		double newPricePerShare = 33.92; 
		
		System.out.println("Joes has paid in total for his shares: " + purchasedShares * pricePerShare);
		System.out.println("Joes has a paid a commision of: " + (purchasedShares * pricePerShare) * commision);
		
		System.out.println("Joe sold his stock for : " + purchasedShares * newPricePerShare);
		System.out.println("Joe paid this time a comission of " + (purchasedShares * newPricePerShare) * commision);
		
		double profit= ((purchasedShares * newPricePerShare) - (purchasedShares * newPricePerShare) * commision) - ((purchasedShares * pricePerShare) - (purchasedShares * pricePerShare) * commision);
		
		System.out.println("Joe made a profit of: " + profit);
		
		
		
		
		
	}

}
