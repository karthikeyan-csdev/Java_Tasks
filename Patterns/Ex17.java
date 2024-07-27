package patterns;

import java.util.Scanner;

/*
C

C
BB
AAA
 */

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		char i,j;
		for(i=c;i>='A';i--) {
			for(j=c;j>=i;j--)
				System.out.print(i);
			System.out.println();
		}
	}

}
