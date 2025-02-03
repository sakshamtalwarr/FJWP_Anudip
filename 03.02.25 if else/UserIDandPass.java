
// Q4. wap to check the userid and password.

import java.util.Scanner;
public class UserIDandPass {
    public static void main(String args[]) {
        String userID = "userid";
        String password = "password";
        Scanner sc = new Scanner(System.in);
        System.out.println("user id is Saksham and password is 123456789");
        System.out.print("Enter User ID: ");
        userID = sc.nextLine();
        System.out.print("Enter Password: ");
        password = sc.nextLine();
        
        if (userID.equals("Saksham") && password.equals("123456789")) {    //maam I used equals method to compare the strings as i was getting error while using == operator 
            System.out.println("Bachgya bete Login hogya!");
        } else {
            System.out.println("!!!! GALAT !!!! Ab Toh Tu Gaya!");
        }
        sc.close();
    }
}
