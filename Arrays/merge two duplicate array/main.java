import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> lst = new ArrayList<>();
        int low = 0, high = 0;

        // Merge both arrays
        while (low < n1 && high < n2) {
            if (arr1[low] < arr2[high]) {
                merged(lst, arr1[low]);
                low++;
            } else if (arr1[low] > arr2[high]) {
                merged(lst, arr2[high]);
                high++;
            } else {
                merged(lst, arr1[low]);
                low++;
                high++;
            }
        }

        // Add remaining elements of arr1
        while (low < n1) {
            merged(lst, arr1[low]);
            low++;
        }

        // Add remaining elements of arr2
        while (high < n2) {
            merged(lst, arr2[high]);
            high++;
        }

        // Print final merged array
        System.out.print("Merged Sorted Array: ");
        for (int num : lst) {
            System.out.print(num + " ");
        }
    }

    // Helper method to add unique values
    public static void merged(List<Integer> list, int value) {
        if (list.isEmpty() || list.get(list.size() - 1) != value) {
            list.add(value);
        }
    }
}
