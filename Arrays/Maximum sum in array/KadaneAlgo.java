// you have to find the maximum sum in the array 
// easy but you have to revice it 


import java.util.* ;
class KadaneAlgo {

public static int ans(int[] arr) {
  
    int res = arr[0] ;
    int ending  = arr[0] ;

    for(int i = 1 ; i < arr.length ; i++) {
       
        ending = Math.max(arr[i] , ending + arr[i]); 
        res = Math.max(res , ending); 


    }
    return res ;
}

    public static void main(String[] args) {
    int[] arr = {2,3,-8,7,-1,2,3} ; 
   int answer =  ans(arr) ; 

   System.out.println(answer);
    }
}