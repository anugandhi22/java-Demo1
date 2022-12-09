package com.capgemini.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("Current date: " +date);
		
		System.out.println(LocalDate.of(2013, Month.AUGUST, 5));
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time: " +time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Current Date and Time: "+dt);
		
		//to print in a particular format
		DateTimeFormatter format = 	DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = dt.format(format);
		System.out.println("Formatted date and time: " +formattedDateTime);
	}

}

