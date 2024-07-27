package number_patterns;
/*
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/

public class Ex_10 {
	public static void main(String[] args) {
	      int n=7;
	      int i,j;
	      for(i=n;i>0;i--){
	        for(j=1;j<=i;j++){
	          System.out.print(j+" ");
	        }
	        System.out.println();
	      }
	      for(i=2;i<=n;i++){
	        for(j=1;j<=i;j++){
	          System.out.print(j+" ");
	        }
	        System.out.println();
	      }
	  }
}