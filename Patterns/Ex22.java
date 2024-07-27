
/*

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1

*/
package number_patterns;
public class Ex_7 {
    Ex_7() {
      int n=7;
      int i,j;
      for(i=1;i<=n;i++){
        for(j=i;j>=1;j--){
          System.out.print(j+" ");
        }
        System.out.println();
      }
  }
}

