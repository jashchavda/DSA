// trust me this is easy just understand it once 
import java.util.* ;
public class NextGreaterElement {
    public static void main(String[] args) {

       int[] arr = {2,4,5,6,7,0,1,3,6,2};
       int n = arr.length; 

       int[] ans = new int[arr.length];

       Stack<Integer> stk = new Stack<>() ;
         
       for(int i = n-1 ; i >= 0 ; i--) { 
         
        
        while(!stk.isEmpty() && stk.peek() <= arr[i]) {
            stk.pop() ; 
        }

        if(stk.isEmpty()) {
            ans[i] = -1 ; 
           }
           else {
            ans[i] = stk.peek() ;      
           }
     
              stk.push(arr[i]);    
      
       }

       System.out.println(Arrays.toString(ans));

    }
}