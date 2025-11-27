import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean ans = check(input);

        if (ans) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Invalid Palindrome");
        }
    }

    public static boolean check(String str) {
        str = str.toLowerCase();
        int low = 0;
        int high = str.length() - 1;

        while (low < high) {
            if (!Character.isLetterOrDigit(str.charAt(low))) {
                low++;
            } else if (!Character.isLetterOrDigit(str.charAt(high))) {
                high--;
            } else {
                if (str.charAt(low) != str.charAt(high)) {
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
}
