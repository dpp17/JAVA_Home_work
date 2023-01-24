package logicbuildingpractice;

import java.awt.image.SampleModel;
import java.util.Scanner;

public class ReverseTheGivenInput {

	public static void main(String[] args) {
		Scanner getUserInput = new Scanner(System.in);
		
		System.out.println("Enter a input :: ");
		String input =getUserInput.next();
				System.out.println(input);
				
				int[] sampleArray=new int[input.length()];
				
				System.out.println(input.length());
				//System.out.println(input.charAt(4));
				
				for(int i = 0;i<sampleArray.length;i++) {
					sampleArray[i]=input.charAt(i);
					System.out.print((char)sampleArray[i]+" ");
				}
				for(int i=sampleArray.length-1;i>=0;i--) {
					System.out.println(sampleArray[i]+" ");
				}
		

	}

}
