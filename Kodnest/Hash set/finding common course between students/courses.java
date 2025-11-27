// easy you should just have the knowledge of list and has set 


import java.util.*;
public class courses {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();

      HashSet<String> stu1 = new HashSet<>();
      for(int i = 0 ; i <  n ; i ++) {
           stu1.add(sc.next());
      }

      HashSet<String> stu2 = new HashSet<>();
      for(int i = 0 ; i < n ; i++) {
        stu2.add(sc.next());
      }

      List<String> ans=  new ArrayList<>();

      for(String ch : stu2) {
             if(stu1.contains(ch)) {
               ans.add(ch);
             }
      }


      if(ans.isEmpty()) {
        System.out.println("nothing in common");
      }
      else {
                 for(String sub : ans) {
                    System.out.print(sub + " ");
                 }
      }


    }
}
