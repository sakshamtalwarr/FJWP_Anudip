
// 1.Create a Java program that acts as a simple calculator.
// ● The program should prompt the user to enter two numbers and an operator (+, -,
// *, /).
// ● Perform the corresponding calculation based on the operator.
// ● Handle potential exceptions, such as division by zero or invalid operator input.
// ● Display the result or an appropriate error message.




import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            double firstNumber = input.nextDouble();
            
            System.out.print("Enter an operator (+, -, *, /): ");
            char op = input.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double secondNumber = input.nextDouble();
            
            double answer;
            
            if (op == '+') {
                answer = firstNumber + secondNumber;
            } else if (op == '-') {
                answer = firstNumber - secondNumber;
            } else if (op == '*') {
                answer = firstNumber * secondNumber;
            } else if (op == '/') {
                if (secondNumber == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                answer = firstNumber / secondNumber;
            } else {
                throw new IllegalArgumentException("Invalid operator. Use +, -, *, or /.");
            }
            
            System.out.println("Result: " + answer);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers and a valid operator.");
        } finally {
            input.close();
        }
    }
}
