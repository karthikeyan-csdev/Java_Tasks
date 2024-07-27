package number_patterns;
/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7

*/

public class Ex_3 {
    Ex_3() {
      int n=7;
      int i,j;
      for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
          System.out.print(i+" ");
        }
        System.out.println();
      }
  }
}