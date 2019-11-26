import java.util.*;

public class TemperatureTest {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature: ");
		
		Temperature temperature = new Temperature(inputScanner.nextDouble());
		
		System.out.println("Fahrenheit temp: " + temperature.getFahrenheit());
		System.out.println("Celsius temp: " + temperature.getCelsius());
		System.out.println("Kelvin temp: " + temperature.getKelvin());
		
		
	}

}
