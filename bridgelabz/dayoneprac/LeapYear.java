//Task_Question :Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
package com.bridgelabz.dayoneprac;

//import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=Integer.parseInt(args[0]);
		
		System.out.println("Entered Year from CommandLineArgument ::" +year);
		
	if ((year%4==0 && year%100!=0) || year%400==0) {
	
		System.out.println("And, "+year+" is a Leap Year.");
	}
	else {
		System.out.println("But "+year+" is not a Leap Year.");
	}
	}

}
