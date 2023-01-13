//Task_Questoin :: To find the sum of command-line arguments and count the invalid integers entered.
package com.bridgelabz.dayoneprac;

public class SumCommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(args[0]);	//used to convert string to integer
		int mun = Integer.parseInt(args[1]);
		
		int Sum=num1 + mun;
				
		System.out.println("Sum :: "+Sum);
	
	}

}
