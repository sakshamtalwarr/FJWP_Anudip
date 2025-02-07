
//takw two numbers as input and print their sum
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("THIS IS A PROGRAM TO ADD TWO NUMBERS");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        sc.close();
    }
}
