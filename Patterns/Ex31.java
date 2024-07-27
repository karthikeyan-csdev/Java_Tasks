/*

7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7

*/
package number_patterns;
public class Ex_6 {
    Ex_6() {
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