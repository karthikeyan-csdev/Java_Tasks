
/*

7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

*/
package number_patterns;
public class Ex_8 {
    Ex_8() {
      int n=7;
      int i,j;
      for(i=n;i>=1;i--){
        for(j=i;j>=1;j--){
          System.out.print(j+" ");
        }
        System.out.println();
      }
  }
}
