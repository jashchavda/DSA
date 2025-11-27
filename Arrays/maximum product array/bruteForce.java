import java.util.* ; 
public class bruteForce {

   public static int maxProduct(int[] arr) {
    int n = arr.length;
    int maxProduct = arr[0];
    for(int i = 0 ; i < n  ; i++) {
    int prod = 1 ; 
        for(int j = i ; j < n ; j++) {
             prod = prod * arr[j] ; 
             maxProduct = Math.max(maxProduct , prod) ;

        }
    
      }

      return maxProduct ; 
   }

    public static void main(String[] args) {
  int[] arr = {-2 , 6, -3 , -10, 0 , 2 } ;
  int maxprod = maxProduct(arr) ; 
  System.out.print("maxpro is" + maxprod);
    }
}
