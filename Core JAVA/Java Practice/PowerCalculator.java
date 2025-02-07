import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        
        int result = 1;
        int count = 0;

        do {
            result *= base;
            count++;
        } while (count < exponent);

        System.out.println(base + "^" + exponent + " = " + result);

        sc.close();
    }
}
