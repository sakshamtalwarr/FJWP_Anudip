// 


import java.util.Scanner;

public class Question9 {
    public static boolean isPalindrome(String str) {
        // Convert to lowercase and remove spaces for case insensitivity
        str = str.replaceAll("\\s", "").toLowerCase();
        
        int left = 0, right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Checking if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("Output: true (The string is a palindrome)");
        } else {
            System.out.println("Output: false (The string is not a palindrome)");
        }

        scanner.close();
    }
}
