import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int n = num;  // store original number if you want to print later

        while (n > 0) {
            int digit = n % 10;  // get last digit
            sum += digit;        // add it to sum
            n = n / 10;          // remove last digit
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
        sc.close();
    }
}
