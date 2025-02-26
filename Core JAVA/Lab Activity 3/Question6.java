// 

import java.util.Stack;
import java.util.Scanner;

public class Question6 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

     
        for (char ch : s.toCharArray()) {
     
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
     
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter a string of parentheses: ");
        String input = scanner.nextLine();


        if (isValid(input)) {
            System.out.println("Output: true (Valid parentheses)");
        } else {
            System.out.println("Output: false (Invalid parentheses)");
        }

        scanner.close();
    }
}
