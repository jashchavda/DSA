import java.util.*;

public class movehashtofront {

    public static String check(String str) {

     int n = str.length() ;

     int count = 0 ; 

       
     char[] arr = str.toCharArray() ; 

    
     for(int i = 0 ; i < n ; i++) {

        if(arr[i] == '#') {
             char temp = arr[i] ; 
             arr[i] = arr[count] ; 
             arr[count] = temp ; 
             count++ ; 
        }
     }

     String ans = new String(arr);
     return ans ; 
    }

    public static void main(String[] args) {

     String str = "abcd#efgh#ijkl#" ; 

     String ans = check(str) ; 

     System.out.println("The new String is: " + ans);


    }
}
