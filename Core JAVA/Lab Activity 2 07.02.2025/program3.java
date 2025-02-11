
// Q3. Wap to calculate the number of digits in a number           (while)
// forexample 3484  =  4 digit
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int num = sc.nextInt();
        int  originalnum = num; 
        int count=0;
        while (num !=0) {
            num =num/10;
            count++;
        }
        System.out.println("The number of digits in " + originalnum + " is " + count);
        sc.close();
        }
        
}

