public class DescendingOrderCharm {

    public static int minSpells(int[] arr) {
        int spell = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                spell += arr[i] - arr[i - 1]; // number of spells needed
                arr[i] = arr[i - 1];          // update the current element
            }
        }

        return spell;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {3, 1, 2, 1};
        System.out.println(minSpells(arr1)); // Expected output: 1

        // Example 2
        int[] arr2 = {3, 1, 5, 1};
        System.out.println(minSpells(arr2)); // Expected output: 4

        // Example 3
        int[] arr3 = {5, 4, 6, 6, 2, 1};
        System.out.println(minSpells(arr3)); // Expected output: 4
    }
}
