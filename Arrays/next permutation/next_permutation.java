// NEXT PERMUTATION 
// BETTER REVISE THE NOTES 
// NOT THAT HARD



import java.util.*;
public class next_permutation {

public static void next_permutation(int[] arr) {

    int pivot  = -1 ;
    for(int i = arr.length - 2 ; i >=0 ; i--) {
         if(arr[i] < arr[i + 1]) {
            pivot = i ;
          break ; 
        }
    }

    if(pivot == -1) {
        reverse(arr,0, arr.length - 1);
        return ;
    }

    for(int i = arr.length - 1 ; i >= 0 ; i--) {
        if(arr[i] > arr[pivot]) {
        int temp = arr[i] ; 
        arr[i] = arr[pivot]; 
        arr[pivot] = temp ;
        break ;
        }
    }

    reverse(arr, pivot + 1, arr.length - 1);


}


    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5,0};
         next_permutation(arr);

         System.out.println(Arrays.toString(arr));


    }

    public static void reverse(int[] arr, int l , int h) {
         while(l < h) {
            int temp = arr[h] ;
            arr[h] = arr[l] ; 
            arr[l] = temp ; 
            l++ ;
            h-- ;
        }

    }
}
