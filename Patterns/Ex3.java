package patterns;

import java.util.Scanner;

/*
 * 
3
333
222
111
 */

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i,j;
		for(i=n;i>0;i--) {
			for(j=0;j<n;j++)
				System.out.print(i);
			System.out.println();
		}
	}

}
