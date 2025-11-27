import java.util.* ; 

public class twoPointer {
public static void main(String[] args) {

int[] arr = {2,3,4,5,6,7,8,9};
int target = 12 ; 

check(arr , target);

}
public static void check(int[] arr , int t) {
      
     int l = 0 ; 
     int r = arr.length - 1 ;
     boolean found = false ; 
     
     
     while(l < r) {

        int sum=  arr[l] + arr[r];
        
        if(sum == t) {
            System.out.println("found and indexes are " + l + " and " + r);
            found = true ; 
            break ; 
        }

        else if(sum > t) {
            r--  ;
        }
        
        else {
            l++ ;
        } 

     }       
          if(found == false) {
            System.out.println("nathi ho kale avjo");
          }
       

}


}