import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of students
        int n = sc.nextInt();
        sc.nextLine(); // consume newline after integer input

        // Step 2: Input student names in sorted order
        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextLine();
        }

        // Step 3: Input the student name to search
        String target = sc.nextLine();

        // Step 4: Perform Binary Search
        int left = 0, right = n - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = students[mid].compareTo(target);

            if (cmp == 0) { // name matches
                found = true;
                break;
            } else if (cmp < 0) { // target is after mid
                left = mid + 1;
            } else { // target is before mid
                right = mid - 1;
            }
        }

        // Step 5: Output result
        if (found) {
            System.out.println("Student Found");
        } else {
            System.out.println("Student Not Found");
        }

        sc.close();
    }
}
