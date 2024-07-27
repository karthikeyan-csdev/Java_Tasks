package patterns;

import java.util.Scanner;

/*
C

A
AB
ABC
 */

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		char i,j;
		for(i='A';i<=c;i++) {
			for(j='A';j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}

}
