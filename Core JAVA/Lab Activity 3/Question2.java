import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) { 
            System.out.print("Enter Basic Salary (or -1 to exit): ");
            int basicSalary = scanner.nextInt();
            
            if (basicSalary == -1) {
                System.out.println("Exiting program...");
                break;  // Exit the loop if -1 is entered
            }

            double HRA, DA, grossSalary;

            // Conditions based on basic salary
            if (basicSalary > 15000) {
                HRA = 0.20 * basicSalary;
                DA = 0.60 * basicSalary;  
            } else {
                HRA = 3000;             
                DA = 0.70 * basicSalary;  
            }

            
            grossSalary = basicSalary + HRA + DA;

            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("HRA: " + HRA);
            System.out.println("DA: " + DA);
            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("-----------progam ends here----------------");
        }
        
        scanner.close();
    }
}
