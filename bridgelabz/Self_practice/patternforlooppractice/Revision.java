package patternforlooppractice;

public class Revision {

	public static void main(String[] args) {

/*
 1
 12
 123
 1234
 12345 
 */

		for(int i =0;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println("");
		}
/*
A
AB
ABC
ABCD
ABCDE
 */

		for(int i=0;i<5;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print((char)(65+j));
			}System.out.println("");
		}
/*
*
**
***
****
*****
 */

		for(int i = 0; i<5; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}System.out.println("");
		}
/*
 1
 22
 333
 4444
 55555 
 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}System.out.println("");
		}
/*
 A
 BB
 CCC
 DDDD
 EEEEE 
 */

		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(65+i));
			}System.out.println("");
		}
/*
     *
    **
   ***
  ****
 ***** 
 */
											//imp
		for(int i=5;i>=1;i--) {
			for(int j = i;j>=0;j--) {
				System.out.print(" ");
			}for(int z = 5;z>=i;z--) {
				System.out.print("*");
		}System.out.println("");
		}
/*
 	1
   121
  12321
 1234321
123454321 
 */											//v.v.imp

		for(int i=1;i<=5;i++) {
			for(int j=9-i;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}for(int z=i-1;z>=1;z-- ) {
				System.out.print(z+" ");
			}System.out.println("");
		}
		/*
	 	5
	   4 5
	  3 4 5 
	 2 3 4 5 
	1 2 3 4 5  
	 */
												//imp
		for(int i =5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
			}for(int j=i;j<=5;j++) {
				System.out.print(j+" ");
			}System.out.println("");
		}
		/*
	 	A
	   A B
	  A B C
	 A B C D
	A B C D E
	 */
		
		for(int i=0;i<=5;i++) {
			
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			
			for(int j=5-i;j<5;j++) {
				System.out.print((char)(60+i+j)+" " );
			}System.out.println("");
		}
		
		
		/*
	 	E
	   D E
	  C D E
	 B C D E
	A B C D E 
	 */
		
		for(int i=0;i<5;i++) {
			for (int j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=5-i;j<=5;j++) {
				System.out.print((char)(64+j)+" ");
			}System.out.println("");
		}
		
/*
     *
    ***
   *****
  *******
 *********
*/		

		for(int i=5;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(" ");
			}for(int j=0;j<=5-i;j++) {
				System.out.print("* ");
			}System.out.println("");
		}
/*
	 1
	2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5 
 */
		
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>=0;j--) {
				System.out.print(" ");
			}for(int j=5-i;j<=5;j++) {
				System.out.print(i+1+" ");
			}System.out.println("");
		}
/*
	A
   B B
  C C C
 D D D D
E E E E E
*/	

		for(int i=0;i<5;i++) {
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
			}for(int j=5-i;j<=5;j++) {
				System.out.print((char)(65+i)+" ");
			}System.out.println("");
		}
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

		for (int i =5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println("");
		}
/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/
		
		for(int i=0;i<5;i++) {
			for(int j =5;j>i;j--) {
				System.out.print(j+" ");
			}System.out.println("");
		}
/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/

		for(int i=0 ;i<5;i++) {
			for(int j=5;j>=5-i;j--) {
				System.out.print(j+ " ");
			}System.out.println("");
		}
		System.out.println("");
/* 
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 
 */
												//v.v.imp
		int temp=1;
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp++;
			}System.out.println("");
		}
		System.out.println("");	
/*
A B C D E 
A B C D 
A B C  
A B 
A
  */
		
		for(int i=5;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(65+j-1)+" ");
			}System.out.println();
		}
		System.out.println("");
/*
E D C B A
E D C B
E D C
E D
E
 */
		for(int i = 5; i > 0 ; i--) {
			for(int j = i; j>0 ;j--) {
				System.out.print((char)(65+j-1)+" ");
			}System.out.println("");
		}
		System.out.println("");
/*
E
E D
E D C
E D C B
E D C B A		 
*/
		
		for(int i=5;i>0;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print((char)(65+j-1)+" ");
			}System.out.println("");
		}
		System.out.println("");
/*
A
B C
D E F
G H I J
K L M N O		 
*/
		temp=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(65+temp-1)+" ");
				temp++;
			}System.out.println("");
		}
		System.out.println("");
/*
	1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;i>=i;j--) {
//				System.out.println(" ");
//			}for(int j=i;j<;) {
//				
//			}
//		}
//		
/*
    A
   A A
  A B A
 A C C A
A D F D A		 
*/
		
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1		 
*/
/*
A
A B
A B C
A B C D
A B C D E
A B C D
A B C
A B
A		 
*/
	}

}
