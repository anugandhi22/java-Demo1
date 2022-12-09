package com.capgemini.datetime;

import java.time.LocalDate;

public class DateTime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2022, 2, 28);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2020, 2, 28);
		System.out.println(date2);
		
		System.out.println(date1.isLeapYear());
		System.out.println(date2.isLeapYear());		

	}

}