//Java Program to Multiply two Numbers
package logicbuildingpractice;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		Scanner getInputNumbers = new Scanner(System.in);
//user input taken
		
		System.out.println("Enter firstNumber ::");	//1st input
		int numberOne=getInputNumbers.nextInt();
		
		System.out.println("Enter twoNumber ::");	//2nd input			
		int numberTwo=getInputNumbers.nextInt();
		
		int product = numberOne*numberTwo;			//product
		System.out.println("Product of Two Numbers are :: "+ product);

	}

}
