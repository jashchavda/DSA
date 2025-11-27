import java.util.Arrays;

public class insertion {

    public static void insertionsort(int[] arr) {
   int n = arr.length;
for(int i = 0 ; i <= n-1 ; i++) {

   int j = i ;

    while(j > 0 && arr[j-1] > arr[j]) {
        int temp = arr[j] ; 
        arr[j] = arr[j-1];
        arr[j-1] = temp ;
            j-- ; 
    }




}


    System.out.println(Arrays.toString(arr));




    }
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3};
           insertionsort(arr);
    }
}
