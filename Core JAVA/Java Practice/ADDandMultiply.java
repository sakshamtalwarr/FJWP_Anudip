import java.util.Scanner; // Import Scanner class

public class ADDandMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter first number: "); 
        int a = sc.nextInt(); // Read first number
        System.out.print("Enter second number: ");
        int b = sc.nextInt(); // Read second number   

        int sum = a + b; // Calculate sum
        int product = a * b; // Calculate product

        // Print results
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        System.out.println("The product of " + a + " and " + b + " is " + product);

        sc.close(); // Close Scanner
    }
}
