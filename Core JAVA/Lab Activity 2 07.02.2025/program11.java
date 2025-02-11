// Q11. Wap to check the password strength(password should contain at least one capital, small alphabet, number and special character.



import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password here to check its strength: ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false; 

        // Check each character in the password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Check if all conditions are met
        if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }

        sc.close();
    }
}
