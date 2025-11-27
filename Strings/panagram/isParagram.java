//The sentence is paragram if it contain all the 26 lettrs once 
import java.util.*;
 class isParagram {

public static boolean check(String s) {

char[] arr = s.toCharArray();

int[] freq = new int[26]; 

for(char ch : arr) {
    if(ch >= 'a'  && ch <= 'z') {
    freq[ch - 'a']++ ;
}}

for(int val : freq) {
   if(val == 0) {
    return false ;
   }
} 
return true ;

}
    public static void main(String[] args) {


    String str1 = "hello workd" ;
      String str2  = "The quick brown fox jumps over the lazy dog";

     System.out.println(check(str1)); 
     System.out.println(check(str2));

}
 }