package com.capgemini.datetime;

import java.time.LocalDate;

public class DateTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to check todays date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//to display yesterdays date
		LocalDate yesterday_date = date.minusDays(1);
		System.out.println(yesterday_date);
		
		LocalDate tomorrow_date1 = date.plusDays(1);
		System.out.println(tomorrow_date1);
		
		LocalDate tomorrow_date2 = yesterday_date.plusDays(2);
		System.out.println(tomorrow_date2);
		
	}

}

