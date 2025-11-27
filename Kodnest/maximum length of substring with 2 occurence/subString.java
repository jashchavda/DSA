import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        int left = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        int maxLength = 0;

        for (int right = 0; right < n; right++) {
            char ch = str.charAt(right);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

            // shrink window if count of current char > 2
            while (mpp.get(ch) > 2) {
                char leftChar = str.charAt(left);  // get the leftmost character
                mpp.put(leftChar, mpp.get(leftChar) - 1);
                if (mpp.get(leftChar) == 0) {
                    mpp.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Maximum Length Substring with Two Occurrences: " + maxLength);
    }
}
