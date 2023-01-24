package logicbuildingpractice;

import java.util.Scanner;

public class AssignmentPractice {
	
	static void doPrimeFactorisation(int factor) {
		int count = 0;
		for(int i = 1; i <=factor; i++) {
			if(factor%i == 0) {
				count++;
			}
		}
		if(count == 2) {
		System.out.print(factor+" ");
	}}
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		
		System.out.println(" Enter no. of size :: ");
		int size = getInput.nextInt();

		int[] inputArray = new int[size];
		int[] freqArray = new int[inputArray.length];
	
		System.out.println("enter inputs : ");
		for(int i = 0; i < inputArray.length; i++) {
			inputArray[i] = getInput.nextInt();
		}
		
		
		int dup = -1;
		for(int j = 0 ; j < inputArray.length; j++) {
		
			int count = 1;
			for(int i = j+1 ; i < inputArray.length; i++) {
				if(inputArray[i] == inputArray[j]) {
					count++;
					freqArray[i]=dup;
				}
			}
			if(freqArray[j]!=dup) {
				freqArray[j]=count;
				}
		}
		
		for(int i = 0; i < inputArray.length; i++) {
				if(freqArray[i]!=-1) {
					System.out.print(inputArray[i]+" :: "+freqArray[i]+ " || ");	
				}
			
		}
	
		
	}
}
	

