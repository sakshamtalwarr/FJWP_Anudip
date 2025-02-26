// Q1. Write a program to find out all the armstrong numbers within a given

// range using a method named printArmstrongNumber( int start, int

// end) by taking input from the user. The program should print the

// Armstrong number in a given range starting from “start” and ending

// with “end”.

// Armstrong Number Example: 153 1

// 3+5

// 3+3

// 3 =153 (Number which is equal

// to the sum of the cubes of its digits)

// Note: input should be taken from the keyboard. Use a loop to calculate the

// Armstrong number from “start” to “end”. Also use loops to calculate the

// cube of a number. Do not use the Math.pow() function. 

import java.util.Scanner;

public class Question1 {
    // Method to print Armstrong numbers in the given range
    static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {  
            int sumOfCubes = 0, temp = num;
            while (temp > 0) {
                int digit = temp % 10; 
                int cube = digit * digit * digit; 
                sumOfCubes += cube;  
                temp /= 10;  
            }
            if (sumOfCubes == num) {  
                System.out.println(num);  // Print Armstrong number
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
        System.out.println("Armstrong numbers in the given range:");
        printArmstrongNumber(start, end);
        
        scanner.close();
    }
}
