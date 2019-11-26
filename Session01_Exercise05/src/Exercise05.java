import javax.sound.midi.Soundbank;

//In Denmark, the sales tax is 25%. Write a program that calculates and prints the tax and the 
//total price of items that before the added tax cost 80, 140, and 230 kr., respectively.


public class Exercise05 {
	
	public static void main(String[] args) {
		
		double salesTax = 0.25; 
		int price1 = 80;
		int price2 = 140;
		int price3 = 230;
		
		int sum = price1 + price2 + price3; 
		
		double totalTax = sum * salesTax; 
		
		System.out.println(totalTax);
	}

}
