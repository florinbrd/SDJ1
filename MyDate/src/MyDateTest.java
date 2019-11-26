
public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(); 
		
		date1.setDay(19);
		date1.setMonth(8);
		date1.setYear(1987);
		
		date1.displayDate();
		System.out.println(date1.displayDate());
		
		date1.isLeapYear();
		
		System.out.println(date1.getAstroSign());;
		
		System.out.println(date1.getMonthName());
		
		MyDate date2 = date1.copy(); 
		MyDate date3 = new MyDate(date1);
		
		date1.nextDay(); 
		
		if(date1.equals(date2)) {
			System.out.println("they are the same");
		} else {
			System.out.println("they are not the same");
		}
		
		date1.nextDays(23);
	}

}
