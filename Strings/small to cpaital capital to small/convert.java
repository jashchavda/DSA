import java.util.* ;
public class convert {
    public static void main(String[] args) { 

        String str = "qwertcqwerCCCCCCasdfghjcccccccccwertyccccadadasCCCC";
        int len = str.length();


        check(str);

    }

    public static void check(String str) {

        

         int n = str.length() ; 

         char[] arr = str.toCharArray();
          for(int i = 0 ; i < n ; i++) {

            if(arr[i] == 'c' || arr[i] == 'C') {

               if(arr[i] == 'c') {
                arr[i] = 'C';
               }
               
               else {
                      arr[i] = 'c'; 
               }

            }
          }
              System.out.println(arr.toString());
    }
}