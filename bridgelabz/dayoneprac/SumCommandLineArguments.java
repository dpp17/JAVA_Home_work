//Task_Questoin :: To find the sum of command-line arguments and count the invalid integers entered.
package com.bridgelabz.dayoneprac;

public class SumCommandLineArguments {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);	//used to convert string to integer
		int num2 = Integer.parseInt(args[1]);
		
		int sum=num1 + num2;
				
		System.out.println("Sum :: "+ sum);
	
	}

}
