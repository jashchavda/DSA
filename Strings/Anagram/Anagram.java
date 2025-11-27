import java.util.*;
class Anagram {

    public static boolean check(String str1 ,String str2) {
     if(str1.length() != str2.length()) {
        return false ;
     }

     char[] arr1 = str1.toCharArray();
     char[] arr2 = str2.toCharArray(); 

     Arrays.sort(arr1);
     Arrays.sort(arr2);

       
     if(Arrays.equals(arr1, arr2)) { 
      return true ;  
     }

  return false ;
    }

    public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent" ;
    String str3 = "qwertyu" ;


    System.out.println(check(str1 ,str2));
    System.out.println(check(str1,str3));


}
}