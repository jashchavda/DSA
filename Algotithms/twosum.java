import java.util.* ;

class twosum {

    public static void main(String[] args) {
    int[] arr = {2,7,11,15,} ; 
    int target = 9 ; 

 int ans[] =  twosumfun(arr,target);   
 System.out.println(Arrays.toString(ans));
            
 }

 public static int[] twosumfun(int[] arr , int t) {

    HashMap<Integer,Integer> mpp = new HashMap<>() ;

    int[] ans = new int[2] ;
    
    for(int i = 0 ; i< arr.length ; i++) {

        int compliment = t - arr[i] ;
        if(mpp.containsKey(compliment)) {
            ans[0] = mpp.get(compliment) ;
            ans[1] = i  ;
        }
        else {
            mpp.put(arr[i] , i);
        }
    }
   return ans ;
 }

}