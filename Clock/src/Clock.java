import java.time.Month;
import java.time.Year;

import com.sun.java.swing.plaf.motif.resources.motif;

public class Clock {
	
	private int hour, minute, second; 
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour; 
		this.minute = minute; 
		this.second = second; 
	}
	
	public Clock(int timeInSeconds) {
		setTime(timeInSeconds);
	}
	
	// copy constructor 
	
	public Clock(Clock obj) {
		hour = obj.hour; 
		minute = obj.minute;
		second = obj.second;
	}
	
	public Clock() {
		hour = 0; 
		minute = 0; 
		second = 0;
	}
	
	public int getHour() {
		return hour; 
	}
	
	public int getMinute() {
		return minute; 
	}
	
	public int getSecond() {
		return second; 
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour; 
		this.minute = minute; 
		this.second = second; 
	}
	
	public void setTime(int timeInSeconds) {
		hour = timeInSeconds / 3600; 
		timeInSeconds -= hour * 3600; 
		
		minute = timeInSeconds / 60; 
		timeInSeconds -= minute * 60; 
		
		second = timeInSeconds; 
	}
	
	public int ConverToSeconds() {
		return hour * 3600 + minute * 60 + second; 
	}
	
	public static int ConverToSec(int hour, int minute, int second) {
		return hour * 3600 + minute * 60 + second; 
	}
	
	
	public void tic() {
		second ++; 
		if(second>59) {
			second =0; 
			minute ++; 
			if(minute>59) {
				minute = 0; 
				hour ++; 
				if(hour > 23) {
					hour = 0; 
				}
			}
		}
	}
	
	// return if there is a difference between the time in Clock object given as argument
	
	public boolean isBefore(Clock time) {
		return ConverToSeconds() < time.ConverToSeconds();
	}
	
	
	// returns the number of seconds between the time in Clock object given as argument 
	
	public int timeInSeconds(Clock time) {
		if(isBefore(time)) {
			return time.ConverToSeconds() - ConverToSeconds();
		} else {
			return 24 * 3600 - (ConverToSeconds() - time.ConverToSeconds());
		}
	}
	
	// returns the time difference between the time and the time in the Clock object given as argument as a Clock object
	
	public Clock timeTo(Clock time) {
		return new Clock(timeInSeconds(time));
	}
	
	// return the time as a String 
	
	public String toString() {
		String time = " ";
		
		if (hour<10) {
			time += "0";
		}
		time += hour + ":";
		
		if(minute<10) {
			time += "0";
		}
		time += minute +":";
		
		if(second<10) {
			time+= "0";
		}
		
		time += second; 
		
		return time; 
	}
	
	// returns whether or not the Clock object given as argument is identical to the current one 
	
	public boolean equals(Clock obj) {
		return (hour == obj.hour && minute == obj.minute && second == obj.second);
	}
	
	// returns a new Clock obj identical to the current one
	
	public Clock copy() {
		return new Clock(hour, minute, second);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
