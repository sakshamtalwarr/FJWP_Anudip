
// Q3. wap to check whether a character is in lower case or upper case?


import java.util.Scanner;
public class UorLcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)){
            System.out.println(ch+ "is an UPPERCASE letter!");
        }
            else if (Character.isLowerCase(ch)){
                System.out.println(ch+ "is a LOWERCASE letter!");
            }
                else{
                    System.out.println(ch+ "I ASKED YOU TO ENTER A CHARACTER...ENTER A CHARACTER YOU FOOL!");
                }
                sc.close();
    
        }
}