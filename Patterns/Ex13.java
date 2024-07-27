package patterns;

import java.util.Scanner;

/*
 * 
3

3
32
321
 */

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i,j;
		for(i=n;i>0;i--) {
			for(j=n;j>=i;j--)
				System.out.print(j);
			System.out.println();
		}
	}

}
