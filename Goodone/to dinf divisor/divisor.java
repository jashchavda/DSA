import java.util.*;

public class divisor {

     public static void check(int n ) {

      List<Integer> l = new ArrayList<>();

      for(int i = 1 ; i*i <= n ; i++) {
           if(n%i == 0) {
           l.add(i);
           if(n/i != i) {
            l.add(n/i);
           }

           }
      }
      Collections.sort(l);
      System.out.println(l);

     }

    public static void main(String[] args) {
        
int n = 36 ; 


 check(n);

    }
}