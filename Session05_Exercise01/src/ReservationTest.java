
public class ReservationTest {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Florin", "Bordei");
		Date date = new Date(22, 11, 1987);
		Room room = new Room(22, 22, 2, 2222, true);
		
		Reservation reservation = new Reservation(person1, room, date);
		
		reservation.setReservation(); 
		
		System.out.println(reservation.toString());
		
		// need to include toString in each classes. 
	}

}
