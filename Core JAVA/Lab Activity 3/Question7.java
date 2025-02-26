

// Q7. Find the Longest Substring Without Repeating Characters

// Given a string, find the length of the longest substring without repeating characters.

// Example:

// Input: "abcabcbb" → Output: 3



import java.util.HashSet;
import java.util.Scanner;

public class Question7 {
    public static int findLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0; 
        HashSet<Character> set = new HashSet<>();

       
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++
            }
            set.add(s.charAt(right)); 
            maxLength = Math.max(maxLength, right - left + 1); 
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

     
        int result = findLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);

        scanner.close();
    }
}
