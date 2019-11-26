import java.util.PrimitiveIterator.OfDouble;

public class MyDate {
	
	private int day, month, year; 
	
	public MyDate(int day, int month, int year) {
		this.day = day; 
		this.month = month; 
		this.year = year; 
	}
	
	public MyDate() {
		
	}
	
	public void setDay (int d) {
		day = d; 
	}
	
	public void setMonth(int m ) {
		month = m; 
	}
	
	public void setYear(int y) {
		year = y; 
	}
	
	public int getDay() {
		return day; 
	}
	
	public int getMonth() {
		return month; 
	}
	
	public int getYear() {
		return year; 
	}
	
	public String displayDate() {
		return day + "/ " + month + " / " + year; 
	}
	
	public void isLeapYear() {
		if(year % 4 == 0 && year % 400 == 0 && year % 100 !=0) {
			System.out.println("You have a leap year");
		} else {
			System.out.println("You do not have a leap year");
		}
	}
	
	public boolean isLearYear() {
		if(year % 4 == 0 && year % 400 == 0 && year % 100 !=0) {
			return true; 
		} else {
			return false; 
		}}
	
	public void daysInMonth() {
		if(month == 1 || month == 3 || month == 4 || month ==5 || month ==6 || month == 7) {
			System.out.println("31 days");
		} else if (month == 2) {
			if(isLearYear()) {
				System.out.println("You have 29 days");
			} else {
				System.out.println("You have 28 days");
			}} else if (month == 8 || month == 9 || month == 10 || month == 11 || month ==12) {
				System.out.println("30 days!");
			} else {
				System.out.println("Error@!");
			}
		}
	
	public String getAstroSign() {
		String string=" ";
		if (month == 3 && month == 4 && day>= 21 && day <= 19) {
			string = "Aries";
		} else if ((month ==4 && day>= 20) || (month ==5  && day<=20)) {
			string = "Taurus";
		} else if ((month == 5 && day >= 21) || (month == 6 && day<= 20)) {
			string = "Gemini";
		} else if ((month == 5 && day>= 21) || (month == 7 && day <= 22)) {
			string = "Cancer";
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			string = "Leo";
		} else if ((month == 8 &&  day >= 23) || (month == 9 && day <= 22)) {
			string = "Virgo";
		} else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			string = "Libra";
		} else if((month == 10 && day >= 23) || (month == 11 && day <=21)) {
			string = "Scorpio";
		} else if ((month == 11 && day>= 22) || (month == 12 && day <= 21)) {
			string = "Sagitatius";
		} else if ((month == 12 && day >= 22) || (month == 1 && day <=19)) {
			string = "Capricorn";
		} else if ((month == 1 && day >=20) || (month == 2 && day<= 18) ){
			string = "Aquarius";
		} else if ((month == 2 && day >=19) || (month == 3 && day <= 20)) {
			string = "Piscies";
		}
		else {
			return "error"; 
		}
		return string;
	}
	
	public String getMonthName() {
		String string = " ";
		
		switch(getMonth()) {
		case 1: 
			string = "January";
			break; 
		case 2: 
			string = "February";
			break; 
		case 3: 
			string = "March";
			break; 
		case 4: 
			string = "April";
			break; 
		case 5: 
			string = "May";
			break; 
		case 6: 
			string = "June";
			break; 
		case 7: 
			string = "July";
			break; 
		case 8: 
			string = "August";
			break; 
		case 9: 
			string = "September";
			break; 
		case 10: 
			string = "October";
			break; 
		case 11: 
			string = "November";
			break; 
		case 12: 
			string = "December";
			break; 
			default: 
				string = "Invalid month";
				break; 
		} return string; 
	}
	
	public boolean equals(MyDate objDate) {
		if(year == objDate.year && month == objDate.month && day == objDate.day) {
			return true; 
		} else {
			return false; 
		}
	}
	
	public boolean equals2(MyDate other) {
		if(!(other instanceof MyDate)) {
			return false; 
		}
		MyDate objDate = (MyDate) other;
		
		return day == other.day && month == other.month && year == other.year; 
	}
	
	public MyDate copy() {
		return new MyDate(day, month, year);
	}
	
	public MyDate(MyDate obj) {
		year = obj.year; 
		month = obj.month; 
		day = obj.day; 
	}
	
	public void nextDay() {
		day++; 
	}
	
	public void nextDays(int days) {
		days += days; 
	}
	
	public boolean isBefore(MyDate other) {
		int d1 = year * 360 + month * 30 + day; 
		int d2 = other.year * 360 + other.month * 30 + other.day; 
		return d1 < d2; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


