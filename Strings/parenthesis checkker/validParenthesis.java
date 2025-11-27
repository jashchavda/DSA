import java.util.*;

public class validParenthesis {
    public static boolean ans(String s) {
        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stk.push(ch);
            } else {
                if (stk.isEmpty()) return false; // prevent crash
                char top = stk.pop();

                if ((ch == ']' && top != '[') ||
                    (ch == '}' && top != '{') ||
                    (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String parenthesis = "{{()}}";  // ✅ Balanced
        String str2 = "{{}}}}";         // ❌ Not balanced
        String str3 = "()[{}]";         // ✅ Balanced
        String str4 = "([)]";           // ❌ Not balanced
        String str5 = ")))";            // ❌ Not balanced

        System.out.println(ans(parenthesis));
        System.out.println(ans(str2));
        System.out.println(ans(str3));
        System.out.println(ans(str4));
        System.out.println(ans(str5));
    }
}
