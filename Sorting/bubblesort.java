import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr=  {5,9,9,1,7,3,7};
          bubble(arr);
    }


    public static void bubble(int[] arr) {

        int n = arr.length ; 

        for(int i = 0 ; i  < n - 1 ; i++) {
        
            for(int j = 0 ; j < n-i-1 ; j++) {   // here we are j < n-i-1 we use < beacsue we are gping til second last element 

                  if(arr[j] > arr[j+1]) {

                    int temp = arr[j+1] ;
                    arr[j+1] = arr[j];
                    arr[j] = temp ;
                  }

            }

      

        }
         System.out.println(Arrays.toString(arr));
    }
    
}
