
// Q5. WAP to count the number of lower case characters, upper case characters, numbers and special characters in a String.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); //

            if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                specialCharCount++; // If it's not a letter or digit, it's a special character
            }
        }


        System.out.println("\nCharacter Count:");
        System.out.println("Lowercase characters: " + lowerCaseCount);
        System.out.println("Uppercase characters: " + upperCaseCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Special characters: " + specialCharCount);

    
        scanner.close();
    }
}
