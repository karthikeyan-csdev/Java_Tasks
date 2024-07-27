package patterns;

/*
4

---4
--43
-432
4321

 */

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i,j;
		for(i=n;i>0;i--) {
			for(j=i-1;j>0;j--)
				System.out.print(' ');
			
			for(j=n;j>=i;j--) 
				System.out.print(j);
			System.out.println();
		}
	}

}
