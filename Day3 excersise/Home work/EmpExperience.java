//Wap to check the experience of an employee, if exp is greater than 20 years then calculate bonus=20% salary,
// else calculate bonus = 10% of salary.
import java.util.Scanner;
class EmpExperience
{
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner (System.in); 

         System.out.print("Enter your Experience here: ");
         int experience = scanner.nextInt(); //took experience as an input

         System.out.print("Enter your Salary here: ");
         double salary = scanner.nextDouble(); //took Salary as an input
        
         double bonus = (experience > 20) ? salary * 0.20 : salary * 0.10;

         System.out.println("Bonus: " + bonus); //print on the user screen
         scanner.close();  
}
}