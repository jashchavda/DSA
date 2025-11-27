import java.util.*;
class frequency {
    public static void main(String[] args) {
String str = "qwertyuioppoi uyt   re   wqlkj     hgf" ; 

   HashMap<Character, Integer> mpp = new HashMap<>() ; 
   
   char[] arr = str.toCharArray();

   for(char ch : arr) {
    
    if(ch != ' ') {
 
        mpp.put(ch , mpp.getOrDefault(ch , 0) + 1);
     
    }
 } 
   for(char ch : mpp.keySet()) {
    System.out.println(ch + "->" + mpp.get(ch) );
   }
    

    }
}
