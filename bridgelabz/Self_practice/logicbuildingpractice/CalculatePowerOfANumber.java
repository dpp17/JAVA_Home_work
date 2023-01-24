//Java Program to calculate power of a number
package logicbuildingpractice;

import java.util.Scanner;

public class CalculatePowerOfANumber {

	static byte checkPower(int poweredNumber) {
		byte checker=0;
		for(int i=1;i<=poweredNumber/2;i++) {
			for(int j = 1;j<=i;j++) {
				if( (int)(Math.pow(j, i))==poweredNumber ) {	//checkiing is number have any root value
					System.out.println("ans :: power  "+i+" and number :: "+j);
					checker++;
				}
			}
		}		
				return checker;
	}
	
//main method
	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Enter a number to number ::");
		int poweredNumber=getInput.nextInt();
		
		checkPower(poweredNumber);
		if (checkPower(poweredNumber)==0) {				//when number dont have any root value
			System.out.println("number dont have root value");
		}
	}

}
