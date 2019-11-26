
public class RoomCarpet {
	
	private double carpetCost; 
	private RoomDimension size; 

	public RoomCarpet(double cost, RoomDimension dim) {
		carpetCost = cost; 
		size = dim;
	}
	
	public double getTotalCost() {
		return carpetCost * size.getArea();
	}
	
}
