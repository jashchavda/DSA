import java.util.Scanner;

public class GCDWithoutRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = 1; // default gcd

        // loop from 1 to min(num1, num2)
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // update gcd if i divides both
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);

        sc.close();
    }
}
