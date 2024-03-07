package Assignment_Course_2.Problem2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int sum = 0;
        int divisorsSum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (n % i == 0) {
                divisorsSum += i;
            }
        }

        System.out.println("Sum up to " + n + ": " + sum);
        System.out.println("Sum of divisors of " + n + ": " + divisorsSum);
    }
}
