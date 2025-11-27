import java.util.*;

public class reverse {
    public static void main(String[] args) {

        int[] arr = {8,7,6,5,4,3,2,} ;
  System.out.println(Arrays.toString(arr));
        reverse(arr);



    }


   public static void reverse(int[] arr) {
   
     int l= 0 ;
     int h = arr.length - 1 ; 
     while(l < h) {
        int temp = arr[h] ;
        arr[h] = arr[l];
        arr[l] = temp;  

        l++;
        h--;
     }
      System.out.println(Arrays.toString(arr));

   } 
}