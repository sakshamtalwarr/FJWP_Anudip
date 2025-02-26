import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int evenCount = 0, oddCount = 0;  // Counters for even and odd numbers
        
        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            int num = scanner.nextInt();
            
            if (num == -1) {  // Exit condition
                System.out.println("Exiting program...");
                break;
            }

            // Checking if the number is even or odd
            if (num % 2 == 0) {
                evenCount++;  // Increase even count
            } else {
                oddCount++;  // Increase odd count
            }
        }
        
        // Display results
        System.out.println("\nTotal Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
        
        scanner.close();
    }
}
