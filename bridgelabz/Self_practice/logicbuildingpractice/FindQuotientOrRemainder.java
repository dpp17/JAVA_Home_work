//Java Program to find quotient and remainder
package logicbuildingpractice;

import java.util.Scanner;

public class FindQuotientOrRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Enter a dividend ::");
		int myDividend = inputNumber.nextInt();
		
		System.out.println("Enter a divisor ::");
		int myDivisor = inputNumber.nextInt();
		
		int quotient = myDividend/myDivisor;
		int remainder= myDividend%myDivisor;
		
		System.out.println("Qoutient of "+myDividend+"/"+myDivisor+" is :: "+quotient);
		System.out.println("Remainder of "+myDividend+"/"+myDivisor+" is :: "+remainder);
		
	}

}
