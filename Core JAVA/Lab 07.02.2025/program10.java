
// Q10. Wap to print the multiplication table of a number given by user
import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(+i+ ") " +number + " * " + i + " = " + number * i);
        }
         sc.close();
    }
}   

