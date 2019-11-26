
public class Rainfall {
	
	public static void main(String[] args) {
		
		int[] rainfall = { 1, 4 ,5 ,6, 11, 12, 22, 12, 23 , 24, 11, 12}; 
		
		int totalRainfall = 0; 
		int highest = rainfall[0];
		int lowest = rainfall[0];
		
		for(int i=0; i < rainfall.length; i++) {
			totalRainfall += rainfall[i];
			
			if(rainfall[i] > highest) {
				highest = rainfall[i];
			}
			
			if(rainfall[i] < lowest) {
				lowest = rainfall[i];
			}
		}
		
		System.out.println("Total is: " + totalRainfall);
		System.out.println("Average is: " + totalRainfall / rainfall.length);
		System.out.println("Highest is: " + highest);
		System.out.println("Lowest is : " + lowest);
		
	}

}
