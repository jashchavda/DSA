import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        selection(arr);
    }

    public static void selection(int[] arr) {


     int n = arr.length ;

     for(int i = 0 ; i < n - 1 ; i++) {
             int maxIndex = i ; 

             for(int j = i+1 ; j< n ; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j ; 
                }
             }

             int temp = arr[i];
             arr[i] = arr[maxIndex];
             arr[maxIndex] = temp;
     }
        

System.out.println(Arrays.toString(arr));
    }
    
}
