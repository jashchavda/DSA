/*Adding first N Abundant Numbers to an Array

A mathematics professor at a university is conducting a class on number properties and introduces students to the
 concept of abundant numbers. The professor gives students a task to find and store the first N abundant numbers
  in an array.

A number is abundant if the sum of its proper divisors is greater than the number itself. A proper divisor of a 
number is any positive divisor excluding the number itself.

The professor asks students to write a program that will take N as input and generate the first N abundant numbers 
while maintaining their order of occurrence.

For example, if the professor asks for the first 5 abundant numbers, the correct answer would be 12, 18, 20, 24, 30.

Input Format:

5
Output Format:

12 18 20 24 30 */




import java.util.*;

public class abundantNumber {

    public static int sumcheck(int num) {
        int sum = 1; // 1 is a proper divisor
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int num = 12; // smallest abundant number
        int count = 0;

        while (count < n) {
            if (sumcheck(num) > num) {
                arr[count] = num;
                count++;
            }
            num++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
