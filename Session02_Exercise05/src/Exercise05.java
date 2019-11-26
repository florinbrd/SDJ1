// read and display number of shares + commision + profits 


import java.util.*; 



public class Exercise05 {
	
	public static void main(String[] args) {
		
	
	String name; 
	double boughtShares, soldShares, commision, profit, priceBoughtShares, priceSoldShares; 
	
	Scanner obScanner = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	name = obScanner.nextLine(); 
	
	System.out.println("Enter the number of shares that you have bought and the price you have paid for it: ");
	boughtShares = obScanner.nextDouble(); 
	priceBoughtShares = obScanner.nextDouble(); 
	
	System.out.println("Enter the commision that you have paid for the shares: ");
	commision = (obScanner.nextDouble()) / 100; 
	
	double finalProfit = (boughtShares*priceBoughtShares) - ((boughtShares*priceBoughtShares)*commision);
	
	System.out.println("Enter the amount of shares that you would like to sell now and the new price: ");
	soldShares = obScanner.nextDouble(); 
	priceSoldShares = obScanner.nextDouble(); 
	
	double finalProfitSecond = (soldShares*priceSoldShares) - ((soldShares*priceSoldShares)*commision);
	
	profit = finalProfitSecond - finalProfit; 
	
	System.out.println("Hello " + name + ", you have made a profit of " + profit + " $");
	
	
	
	
	

	


}}
