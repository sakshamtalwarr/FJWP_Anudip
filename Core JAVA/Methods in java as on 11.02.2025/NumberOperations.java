/*
    WAP (Write a program) to perform some operations based on user choice:
    1. Check if a number is Prime.
    2. Check if a number is an Armstrong number.
    3. Print Fibonacci Series.
    4. Check if a number is Even.
    5. Exit.
 
*/

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take user input
        
        while (true) { // Loop to keep showing menu until exit
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Armstrong Number");
            System.out.println("3. Print Fibonacci Series");
            System.out.println("4. Check Even Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt(); // Taking user choice input
            
            if (choice == 5) { // Exit condition
                System.out.println("Exiting program...");
                sc.close();
                break;
            }

            System.out.print("Enter a number: ");
            int num = sc.nextInt(); // Taking number input from user

            if (choice == 1) { // Checking if number is Prime
                boolean isPrime = true;
                if (num < 2) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                System.out.println(num + " is " + (isPrime ? "a Prime number." : "not a Prime number."));
            } 
            
            else if (choice == 2) { // Checking if number is Armstrong
                int temp = num, sum = 0, digits = String.valueOf(num).length();
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += Math.pow(digit, digits);
                    temp /= 10;
                }
                System.out.println(num + " is " + (sum == num ? "an Armstrong number." : "not an Armstrong number."));
            } 
            
            else if (choice == 3) { // Printing Fibonacci series
                int a = 0, b = 1;
                System.out.print("Fibonacci Series: ");
                for (int i = 0; i < num; i++) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                }
                System.out.println();
            } 
            
            else if (choice == 4) { // Checking if number is Even
                System.out.println(num + " is " + (num % 2 == 0 ? "even." : "odd."));
            } 
            
            else { // If number other than 1-5 is entered this will be printed
                System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
