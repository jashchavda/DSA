public class bruteForce {
    public static void main(String[] args) {

        int[] arr = {2,3,4,4,4,4,4,5,6,};
       int ans = check(arr);
       System.out.println(ans);

    }

    public static int check(int[] arr) {
        int n = arr.length ; 
        int m = n/2 ; 


        for(int i = 0 ; i < n ; i ++) {
            int element = arr[i];
            int count  = 0  ; 

            for(int j = 0 ; j < n ; j++) {
              if(arr[j] == element) {
                count++ ; 
              }
            }

            if(count > m) {
            return element ; 
            }
        }
        return -1 ; 
    }
}
