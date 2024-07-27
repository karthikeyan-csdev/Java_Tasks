package number_patterns;
/*
7 7 7 7 7 7 7
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1

*/

public class Ex_4 {
    Ex_4() {
      int n=7;
      int i,j;
      for(i=n;i>=1;i--){
        for(j=1;j<=i;j++){
          System.out.print(i+" ");
        }
        System.out.println();
      }
  }
}