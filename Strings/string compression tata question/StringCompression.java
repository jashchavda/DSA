import java.util.*;

class StringCompression {
    
    public static void main(String[] args) {

        String str = "aaabbbbcccccddefgh" ; 
        check(str) ;

    }

    public static void check(String str) {

      int n = str.length() ; 
      
      int count = 1 ; 
      StringBuilder str1 = new StringBuilder();
      
      for(int i = 1 ; i < n; i++) {
        if(str.charAt(i) == str.charAt(i-1)) {
            count++ ; 
        }
        else {
            str1.append(str.charAt(i-1)).append(count);
             count = 1 ; 

        }
      } 
         System.out.println(str1.toString());            
    }
}