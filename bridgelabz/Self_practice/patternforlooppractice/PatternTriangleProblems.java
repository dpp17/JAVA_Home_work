package patternforlooppractice;

public class PatternTriangleProblems {

	public static void main(String[] args) {
//square
/*

* * * * * *  
* * * * * *  
* * * * * *  
* * * * * *  
* * * * * *

*/
		for(int i=0;i<5;i++) {
			System.out.println(" ");
			for(int j=5;j>=0;j--) {
				System.out.print("* ");
			}
		}
		System.out.println('\n');
//right angled triangle
/* 

*  
* *  
* * *  
* * * *  
* * * * * 

*/		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");	
		}
		System.out.println('\n');
//reverse right angled triangle
/*
 
* * * * *  
* * * *  
* * *  
* *  
* 

*/
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
// reverse numbers in right angled triangle
/*

5 
54 
543 
5432 
54321

*/	
		for(int i=0;i<=5;i++) {
				for(int z=5;z>5-i;z--) {
				System.out.print(z);
				}
				System.out.println(" ");
		}
		System.out.println('\n');
// number in reverse right angled triangle
/* 

12345 
1234 
123 
12 
1

*/
		for(int i=5;i>=0;i--) {
			for(int z=1; z<=i; z++) {
			System.out.print(z);
			}
			System.out.println(" ");
		}
		System.out.println('\n');
/*
 
55555 
4444 
333 
22 
1 

*/		
		for(int i=5;i>=0;i--) {
			for(int z=1; z<=i; z++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
		System.out.println('\n');
/* 
1 
22 
333 
4444 
55555 

*/
		for(int i=1;i<=5;i++) {
			for(int z=1; z<=i; z++) {
				System.out.print(i);
			}
		System.out.println(" ");
		}
		System.out.println('\n');
/*

PATTERN::03

54321 
4321 
321 
21 
1
 
*/
		for(int i=5;i>=0;i--) {
			for(int z=i; z>=1; z--) {
			System.out.print(z);
			}
			System.out.println(" ");
		}
		System.out.println('\n');
		
	}
}
