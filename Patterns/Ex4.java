package patterns;

import java.util.Scanner;

/*
3
321
321
321

 */

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i,j;
		for(i=n;i>0;i--) {
			for(j=n;j>0;j--)
				System.out.print(j);
			System.out.println();
		}
	}

}
