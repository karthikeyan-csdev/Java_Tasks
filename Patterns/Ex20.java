package patterns;

/*
4

---1
--22
-333
4444

 */

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=n-i;j>0;j--)
				System.out.print(' ');
			
			for(j=1;j<=i;j++) 
				System.out.print(i);
			System.out.println();
		}
	}

}
