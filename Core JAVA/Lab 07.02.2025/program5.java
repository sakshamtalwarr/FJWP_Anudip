
// Q5  :  wap to reverse digits of a number like 1243   will become 3421 using for loop
import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse its digits: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            int x = num % 10;
            rev = rev * 10 + x;
            num /= 10;
        }
        System.out.println("The reversed number is: " + rev);
        sc.close();
    }
}
