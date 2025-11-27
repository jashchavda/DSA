import java.util.*;
public class validParenthesis {
 public static boolean ans(String s)
 {
  
    Stack<Character> stk = new Stack<>();

    for(char ch : s.toCharArray()) {
        if(ch == '{' || ch == '[' || ch == '(') {
            stk.push(ch) ;
        }
        else {

            if(stk.isEmpty()) {
                return false ;
            }
            char top = stk.pop();

            if(ch == ']' && top != '[' || ch == '}' && top != '{' || ch == ')' && top!='(') {
               return false ;
            }
        }
    }

    return stk.isEmpty() ;



 }
    public static void main(String[] args) {





    String parenthesis = "{{()}}";
    String str2 = "{{}}}}" ;

    System.out.println(ans(parenthesis));  

    System.out.println(ans(str2));



 }   

}
