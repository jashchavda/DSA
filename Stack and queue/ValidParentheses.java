import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Handle closing brackets
            else {
                if (stack.isEmpty()) return false; // no opening bracket to match

                char top = stack.peek(); // check without removing

                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    stack.pop(); // ✅ remove it only if it matches
                } else {
                    return false; // mismatch
                }
            }
        }

        // If stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "([)]";
        String s3 = "{[]}";
        String s4 = "(((";

        System.out.println(s1 + " -> " + isValid(s1)); // true
        System.out.println(s2 + " -> " + isValid(s2)); // false
        System.out.println(s3 + " -> " + isValid(s3)); // true
        System.out.println(s4 + " -> " + isValid(s4)); // false
    }
}
