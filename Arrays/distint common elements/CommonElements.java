import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array
        System.out.println("Enter the first array:");
        String[] arr1Str = scanner.nextLine().split(" ");
        int[] arr1 = new int[arr1Str.length];
        for (int i = 0; i < arr1Str.length; i++) {
            arr1[i] = Integer.parseInt(arr1Str[i]);
        }

        // Input second array
        System.out.println("Enter the second array:");
        String[] arr2Str = scanner.nextLine().split(" ");
        int[] arr2 = new int[arr2Str.length];
        for (int i = 0; i < arr2Str.length; i++) {
            arr2[i] = Integer.parseInt(arr2Str[i]);
        }

        // Use a set for distinct elements in second array
        Set<Integer> set2 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        }

        // Find common elements preserving order from first array
        Set<Integer> seen = new HashSet<>(); // to avoid duplicates in output
        List<Integer> common = new ArrayList<>();

        for (int num : arr1) {
            if (set2.contains(num) && !seen.contains(num)) {
                common.add(num);
                seen.add(num);
            }
        }

        // Print result
        System.out.println("Common Elements: " + common);
    }
}
