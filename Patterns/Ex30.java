package number_patterns;
/*

7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1

*/

public class Ex_5 {
    Ex_5() {
      int n=7;
      int i,j;
      for(i=1;i<=n;i++){
        for(j=n;j>=i;j--){
          System.out.print(j+" ");
        }
        System.out.println();
      }
  }
}