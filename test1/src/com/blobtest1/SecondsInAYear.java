package com.blobtest1;

public class SecondsInAYear {
	public static void main (String [] args) {
		int daysInYear = 365;
		int hoursInDay = 24;
		int secondsInHour = 60;
		
		double result = (secondsInHour * hoursInDay) * daysInYear;
		System.out.println("The number of seconds in a year is " + result);
		
	}

}
