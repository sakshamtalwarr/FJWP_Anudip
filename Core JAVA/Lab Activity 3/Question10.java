// Q10. Factorial Calculation

// Write a program to calculate the factorial of a number using recursion.

// Example:

// Input: 5 → Output: 120

import java.util.Scanner;

public class Question10 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial: " + factorial(num));
        scanner.close();
    }
}
