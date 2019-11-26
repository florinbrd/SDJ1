
public class Exercise03 {
	
	public static void main(String[] args) {
		
		int[] sourceArray = { 1,2,3};
		int[] destinationArray = new int[6];
		
		for (int i =0 ; i< (destinationArray.length / 2) ; i ++) {
			destinationArray[i]  = sourceArray[i];
		}
		
		for (int i =0; i< destinationArray.length; i++) {
			System.out.println(destinationArray[i]);
		}
	}

}
