import java.util.*;
public class byHashSett{

    public static int check(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : arr) {
            if(set.contains(val)) return val; // duplicate found
            set.add(val); // just store the number
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] r = {1,2,3,4,5,6,6,7};
        System.out.println(check(r)); // Output: 6
    }
}
