package patterns;

import java.util.Scanner;

/*
C
CCC
BBB
AAA
 */

public class Ex24 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		char i,j;
		for(i=c;i>='A';i--) {
			for(j=c;j>='A';j--)
				System.out.print(i);
			System.out.println();
		}
		for(i='A';i<=c;i++) {
			for(j=(char) (c-i);j>'A';j--)
				System.out.print(' ');
			
			for(j=1;j<=i;j++) 
				System.out.print(i);
			System.out.println();
		}
	}

}
