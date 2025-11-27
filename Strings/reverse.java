public class reverse {

    public static void main(String[] args) {
        String str = "qwertyuiop";
      reverse(str) ;
    }

    public static void reverse(String str) { 
   String ans = "" ;


        for(int i = str.length() - 1 ;  i >= 0 ; i--) {
           ans  = ans + str.charAt(i);
        }
 System.out.println(ans);

    }
}