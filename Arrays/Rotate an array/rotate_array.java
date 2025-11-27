import java.util.Arrays;
import java.util.*;

public class rotate_array {
    
   public static void rotateArray(int[] arr , int input) {
  int n = arr.length ;
  
 int count = 0 ; 
    while(count < input) {
    int first = arr[0] ;
    for(int i = 0 ; i < arr.length -1 ; i++) {
        arr[i] = arr[i + 1]; 
    }

    arr[n - 1] = first ;

   count ++ ;
    }


   }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    int input = sc.nextInt();
        int[] arr=  {1,2,3,4,5,6,7,8} ;
          System.out.println(Arrays.toString(arr));
        rotateArray(arr,input) ;

        System.out.println(Arrays.toString(arr));
    }
}
