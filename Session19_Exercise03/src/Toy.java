
public abstract class Toy {
	
	private int suitableAge; 
	
	public Toy(int suitableAge) {
		this.suitableAge = suitableAge; 
	}
	
	public abstract String play(); 
	
	public String toString() {
		return suitableAge +" "; 
	}
}
