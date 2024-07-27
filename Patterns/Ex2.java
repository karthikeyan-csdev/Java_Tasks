package patterns;

import java.util.Scanner;

/*
 * 
3
111
222
333

 */

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++)
				System.out.print(i+1);
			System.out.println();
		}
	}

}
