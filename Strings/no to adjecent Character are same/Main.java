// leetcode 767 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reorganizeString(s));
    }

    public static String reorganizeString(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        int maxFreq = 0, maxChar = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = i;
            }
        }

        if (maxFreq > (n + 1) / 2) return "";

        char[] res = new char[n];
        int idx = 0;

        // Step 1: place the most frequent char in even indices
        while (freq[maxChar] > 0) {
            res[idx] = (char)(maxChar + 'a');
            idx += 2;
            freq[maxChar]--;
        }

        // Step 2: place remaining chars
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                if (idx >= n) idx = 1; // switch to odd indices
                res[idx] = (char)(i + 'a');
                idx += 2;
                freq[i]--;
            }
        }

        return new String(res);
    }
}
