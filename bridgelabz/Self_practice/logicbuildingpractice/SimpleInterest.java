//Java Program to calculate simple interest
package logicbuildingpractice;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner getInputNumbers = new Scanner(System.in);
//user input taken
		
		System.out.println("Enter initial Principal Balance ::");	//initial Principal Balance
		float initialPrincipalBalance=getInputNumbers.nextInt();
		
		System.out.println("Enter annual Interest Rate ::");
		float annualInterestRate=getInputNumbers.nextInt();	//annual Interest Rate
		
		System.out.println("Enter time In Years ::");	//time In Years
		int timeInYears=getInputNumbers.nextInt();
//final amount
		float finalAmount= (float) (initialPrincipalBalance*(1 + annualInterestRate*timeInYears*(0.01)));
//Interest
		float interest= finalAmount - initialPrincipalBalance;

		System.out.println("Final Amount :: "+finalAmount+"  Interest :: "+interest);
	}

}
