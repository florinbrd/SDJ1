
public class Room {
	
	private int roomNo; 
	private int floor; 
	private int block; 
	private int noSeats; 
	private boolean projector; 
	
	
	public Room(int roomNo, int floor, int block, int noSeats, boolean projector)
	{
		this.roomNo = roomNo; 
		this.floor = floor; 
		this.block = block; 
		this.noSeats = noSeats; 
		this.projector = projector; 
		 
	}
	
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo; 
	}
	
	public void setFloor(int floor) {
		this.floor = floor; 
	}
	
	public void setBlock(int block) {
		this.block = block; 
	}

	public void setNoSeats(int noSeats) {
		this.noSeats = noSeats; 
	}
	
	public void setProjector(boolean projector) {
		this.projector = projector; 
	}
	
	
	
	public int getRoomNo() {
		return roomNo;
	}
	
	public int getFloor() {
		return floor; 
	}
	
	public int getBlock() {
		return block; 
	}
	
	public int getNoSeats() {
		return noSeats; 
	}
	
	public boolean getProjector() {
		return projector; 
	}
	
	
}
