package patterns;

import java.util.Scanner;

/*
C
CBA
CBA
CBA
 */

public class Ex8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		char i,j;
		for(i=c;i>='A';i--) {
			for(j=c;j>='A';j--)
				System.out.print(j);
			System.out.println();
		}
	}

}
