//Java Program to calculate compound interest
/* First, convert R as a percent to r as a decimal
P=10000
n=1(Quarterly)
t=4 years

r = R/100
r = 4/100
r = 0.04 rate per year,

Then solve the equation for A
A = P(1 + r/n)^nt
A = 10,000.00(1 + 0.04/4)^(4)(4)
A = 10,000.00(1 + 0.01)^(16)
A = $11,725.79
*/

package logicbuildingpractice;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner getInputNumbers = new Scanner(System.in);
//user input taken

//initial Principal Balance		
		System.out.println("Enter initial Principal Balance { p } ::");	
		float initialPrincipalBalance=getInputNumbers.nextInt();

//Interest Rate
		System.out.println("Enter Interest Rate { i } ::");
		float interestRate=getInputNumbers.nextInt();	

//number of time periods elapsed		
		System.out.println("Enter number of time periods elapsed { t } ::");	
		int timeInYears=getInputNumbers.nextInt();

//number of times interest applied per time period(no. of times compounded)
		System.out.println("Enter number of times interest applied per time period { n }  ::");	
		int interestPerTimePeriod=getInputNumbers.nextInt();
		
//final amount
				float finalAmount=initialPrincipalBalance*(float)Math.pow((1+((0.01*interestRate)/interestPerTimePeriod)),(interestPerTimePeriod*timeInYears) );

//Interest
				float interest= finalAmount - initialPrincipalBalance;
				
				System.out.println("Final Amount :: "+finalAmount+"  Interest :: "+interest);
	}

}
