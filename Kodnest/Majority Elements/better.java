import java.util.* ; 
public class better {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,1,2,3,4,5} ;
        
        int ans = check(arr);
    
      System.out.println(ans);
    }

    public static int check(int[] arr) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

       int n = arr.length ; 
       int m = n/2 ;


       for(int num : arr) {
          mpp.put(num , mpp.getOrDefault(num, 0) + 1);
       }

      
       for(Map.Entry<Integer,Integer> it : mpp.entrySet()) {
        if(it.getValue() > m ) {
            return it.getKey() ; 
        }
       }
       return -1 ; 
    }
}
