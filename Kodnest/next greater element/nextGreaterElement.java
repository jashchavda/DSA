import java.util.Stack;

class nextGreaterElement {

    public static int[] greaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop all smaller or equal elements
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }

            // If stack is empty → no greater element
            if (stk.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stk.peek();
            }

            // Push current element for future comparisons
            stk.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 7, 8};
        int[] res = greaterElement(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i < res.length - 1) System.out.print(" ");
        }
    }
}
