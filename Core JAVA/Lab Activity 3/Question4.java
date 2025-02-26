//Wap to perform some operations by giving user options 

//to perform each operation.

// 1. check prime number

// 2. check Armstrong number

// 3. print fibonacci series

// 4. check even number

// 5. exit

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Armstrong Number");
            System.out.println("3. Print Fibonacci Series");
            System.out.println("4. Check Even Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check if it's prime: ");
                    int primeNum = scanner.nextInt();
                    if (isPrime(primeNum)) {
                        System.out.println(primeNum + " is a Prime Number.");
                    } else {
                        System.out.println(primeNum + " is NOT a Prime Number.");
                    }
                    break;
                
                case 2:
                    System.out.print("Enter a number to check if it's Armstrong: ");
                    int armNum = scanner.nextInt();
                    if (isArmstrong(armNum)) {
                        System.out.println(armNum + " is an Armstrong Number.");
                    } else {
                        System.out.println(armNum + " is NOT an Armstrong Number.");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter how many terms of Fibonacci series to print: ");
                    int n = scanner.nextInt();
                    printFibonacci(n);
                    break;
                
                case 4:
                    System.out.print("Enter a number to check if it's even: ");
                    int evenNum = scanner.nextInt();
                    if (evenNum % 2 == 0) {
                        System.out.println(evenNum + " is an Even Number.");
                    } else {
                        System.out.println(evenNum + " is an Odd Number.");
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;  // Exit the program
                
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    // Method to check Prime Number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;
        
        while (temp > 0) {  
            digits++;
            temp /= 10;
        }
        
        temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {  
                power *= rem;
            }
            sum += power;
            temp /= 10;
        }
        
        return sum == num;
    }

    // Method to print Fibonacci Series
    public static void printFibonacci(int terms) {
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: " + a + " " + b);
        
        for (int i = 2; i < terms; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
