import java.util.HashMap;

public class ByHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 2};
        int ans = fun(arr);
        System.out.println("The answer is : " + ans);
    }

    public static int fun(int[] arr) {
        int threshold = arr.length / 2;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // First pass: count frequencies
        for (int num : arr) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        // Second pass: find majority element
        for (int num : mpp.keySet()) {
            if (mpp.get(num) > threshold) {
                return num;
            }
        }

        return 0; // if no majority exists (not needed in LeetCode 169)
    }
}
