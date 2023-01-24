package logicbuildingpractice;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner inputToCheck = new Scanner(System.in);
		
		int againCheck=0;
//used do while to check multiple times using user input only as many times user wants.
		do {
				System.out.println("Enter a number to check for even or odd :: ");
				int numberToCheck=inputToCheck.nextInt();
//checking for even and odd
				if(numberToCheck%2 == 0) {
					System.out.println("Even");
				}else {
					System.out.println("Odd");
				}
//this gives user to have 2 options, whatever he/she chooses.
				System.out.println("Enter 1 to Check again or else Enter anything :: ");
				againCheck=inputToCheck.nextInt();
				
		}while(againCheck==1);
	}

}
