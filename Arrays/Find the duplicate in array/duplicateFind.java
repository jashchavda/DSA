//

import java.util.*;
public class duplicateFind {

    public static int check(int[] arr) {
       HashMap<Integer,Integer> mpp = new HashMap<>();
       
       for( int val : arr) {
        if(mpp.containsKey(val)) {
            return val ;
        }
        mpp.put(val,1);
       }

       return -1;
      
    }
    public static void main(String[] args) {
        int[] r = {1,2,3,4,5,6,6,7};
        int ans = check(r);
        System.out.println(ans); 
    }
}