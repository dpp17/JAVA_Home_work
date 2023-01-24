package logicbuildingpractice;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
//welcome message
		System.out.println("::      Lets Add      ::");
		
		Scanner getInputNumbers = new Scanner(System.in);
//user input taken
		System.out.println("Enter first number ::");
		int getFirstNumber=getInputNumbers.nextInt();
		System.out.println("Enter second number ::");
		int getSecondNumber=getInputNumbers.nextInt();
		
		int sum = getFirstNumber + getSecondNumber;
		System.out.println("Sum of two entered numbers is :: " + sum);
	}

}
