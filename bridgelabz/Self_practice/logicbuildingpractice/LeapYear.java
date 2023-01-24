//Java Program to check Leap Year
package logicbuildingpractice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner getInputYear = new Scanner(System.in);
//user input taken
		int inputYear=0;
		System.out.println("Enter Year ::");	  //Year input
		inputYear=getInputYear.nextInt();
		
		while(inputYear>=10000 || inputYear <=999) {
		
		System.out.println("---- Wrong Year ----"+'\n'+"Enter Again { 1000-9999 }::");	  //Year input
		inputYear=getInputYear.nextInt();
		}
		if(inputYear%4 == 0 && inputYear%100 != 0) {
			System.out.println(":::   Leap Year   :::");
		}else if (inputYear%400 == 0) {
			System.out.println(":::   Leap Year   :::");
		}else {
			System.out.println(":::   Not Leap Year   :::");
		}
		
		//System.out.println(inputYear);
	}

}
