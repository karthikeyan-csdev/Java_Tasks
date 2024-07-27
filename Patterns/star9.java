/*

* * * * * * *
  * * * * *
    * * *
      *

*/

class Star9{
	public static void main(String[] args){
		int j;
		for(int i=1;i<=7;i++){
			for(j=7;j>=i;j--){
				if( (i%2) == 1)
					System.out.print(" *");
			}
		System.out.println();

			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}

		}
	}
}