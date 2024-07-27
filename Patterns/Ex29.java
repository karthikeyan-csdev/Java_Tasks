package number_patterns;
/*
 			1 
          1 2 
        1 2 3 
      1 2 3 4 
    1 2 3 4 5 
  1 2 3 4 5 6 
1 2 3 4 5 6 7 
*/

public class Ex_12 {
	public static void main(String[] args) {
	      int n=7;
	      int i,j,k;
	      for(i=1;i<=n;i++){
	        for(j=1;j<=n-i;j++){
	          System.out.print("  ");
	        }
	        for(k=1;k<=i;k++) {
	        	System.out.print(" "+k);
	        }
	        System.out.println();
	      }
	  }
}