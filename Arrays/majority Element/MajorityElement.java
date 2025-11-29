import java.util.* ;

class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 7, 8, 5};
        
        int answer = fun(nums);
        System.out.println("The majority Element is: " + answer);
    }

    public static int fun(int[] arr) {
        int size = arr.length; 
        int count = 0;
        int element = 0;

        // Phase 1: Boyer–Moore voting algorithm to find candidate
        for (int num : arr) {
            if (count == 0) {
                element = num;     // set new candidate
            }
            if (num == element) {
                count++;          // vote in favor
            } else {
                count--;          // vote cancel
            }
        }

        // Phase 2: Verify (if majority is not guaranteed)
        int newCount = 0;
        for (int num : arr) {
            if (num == element) {
                newCount++;
            }
        }

        if (newCount > size / 2) {
            return element;
        }

        return 0; // if no majority exists
    }
}
