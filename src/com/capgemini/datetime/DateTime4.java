package com.capgemini.datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println(ZoneId.getAvailableZoneIds());
		
		for(String i: ZoneId.getAvailableZoneIds()) {
			System.out.println(i);
		}*/
		
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		LocalTime time1 = LocalTime.now(zone1);
		System.out.println(time1);
		
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");
		LocalTime time2 = LocalTime.now(zone2);
		System.out.println(time2);
		
		long hours = ChronoUnit.HOURS.between(time1, time2);
		System.out.println(hours);
		
		long min = ChronoUnit.MINUTES.between(time1, time2);
		System.out.println(min);
		
		
	}

}

