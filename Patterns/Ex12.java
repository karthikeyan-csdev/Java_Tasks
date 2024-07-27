package patterns;

import java.util.Scanner;

/*
 * 
3

3
22
111
 */

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i,j;
		for(i=n;i>0;i--) {
			for(j=n;j>=i;j--)
				System.out.print(i);
			System.out.println();
		}
	}

}
