import java.util.*;

class ProductArrayExceptSelf {
public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    int[] ans = fun(arr);

    System.out.println("The result array is: " + Arrays.toString(ans));

}

public static int[] fun(int[] arr) {

    int n = arr.length;

    int[] prefix = new int[n];
    prefix[0] = 1 ; 

    for(int i = 1 ; i < n ; i++) {
        prefix[i] = prefix[i-1] * arr[i-1];
    }

    int[] suffix = new int[n];

    suffix[n - 1] = 1 ;
    for(int i = n-2 ; i >= 0 ; i--) {
        suffix[i] = suffix[i+1] * arr[i+1];
    }
      int[] ans = new int[arr.length];
      for(int i = 0 ; i < n ; i++) {
        ans[i] = suffix[i] * prefix[i];
      }

      return ans; 

}
}