// Q13. Wap to count the number of characters in a string.

import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count its characters: ");
        String character = sc.nextLine(); // took input as a string from the userr

        
        int count = character.length();    //i used the length method here to count the number of characters

        System.out.println("The number of characters in the string is: " + count);
        
        sc.close();
    }
}
