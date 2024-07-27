package number_patterns;
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/

public class Ex_11 {
	public static void main(String[] args) {
	      int n=7;
	      int i,j,k;
	      
	      for(i=0;i<=n;i++){
	    	  
	        for(j=1;j<=i;j++){
	          System.out.print(j+" ");
	        }
	        for(k=i;k>1;k--) {
		        System.out.print(k-1+" ");
	        }
	        System.out.println();
	      }
	      
	  }
}