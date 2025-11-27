import java.util.* ;

public class binary_search {

    static int bs(int[] arr , int n ) {
        int low = 0 ; 
        int high = arr.length - 1 ;
    
        
        while(low <= high) {
              int mid = low + (high - low) / 2 ;
            if( arr[mid] == n) {
                return mid ;
            }

            if(arr[mid] < n) {
                low = mid + 1 ;                 
           }
           else 
              high = mid - 1 ;
        }

     return -1 ;
}

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
         

      for(int i = 0  ; i < arr.length ; i++) {
        arr[i] = sc.nextInt();
      }
          Arrays.sort(arr);

      int n = sc.nextInt();

      int result = bs(arr , n);
     System.out.println("The array is: " + Arrays.toString(arr));
     System.out.println("The number " + n + " is at index " + result);

    }
}

