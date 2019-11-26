
public class Reservation {
	
	private Person person; 
	private Room room; 
	private Date date; 
	private boolean reserved; 
	
	public Reservation(Person person, Room room, Date date) {
		this.person = new Person(person.getName(), person.getSurname());
		this.room = new Room(room.getRoomNo(), room.getFloor(), room.getBlock(), room.getNoSeats(), room.getProjector());
		this.date = new Date(date.getDay(), date.getMonth(), date.getYear());
		
	}
	
	public void setReservation() {
		this.reserved = true; 
	}
	
	public boolean getReservation() {
		return reserved; 
	}
	
	public void removeReservation() {
		this.reserved = false; 
	}
	
	public String toString() {
		return "Room" + room + "is reserved to: " + person +
				"for the period of " + date; 
	}

	
	

}
