package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
	
	public static void checkingAdjusters() {
		
		LocalDate date = LocalDate.now();
		System.out.println("The current date is"+date);
		
		//to get first day of month
		LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstDayOfNextMonth: "+dayOfNextMonth);
		
		//to get next saturday
		LocalDate nextSaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("next saturday is : "+nextSaturday);
		
		//first day of current month
		LocalDate firstDay=date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("firstDayOfMonth: "+firstDay);
		
		//last day of current month
		LocalDate lastDay=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("lastDayOfMonth: "+lastDay);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkingAdjusters();

	}

}
