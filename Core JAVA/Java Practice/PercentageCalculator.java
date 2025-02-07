
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total marks of 5 subjects: ");
        int totalmarks= sc.nextInt();
        System.out.println("Enter the obtained marks of 5 subjects: ");
        int obtainedmarks= sc.nextInt();
        float percentage = (obtainedmarks *100.0f) / totalmarks;
        System.out.println("The percentage is: "  + percentage + "%");
        sc.close();

    }
}
