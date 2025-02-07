
// Q1.2  Wap to print  even numbers(input number of elements from user).

import java.util.Scanner;

class program1secPart {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many even numbers you want: ");
        int evennumber = sc.nextInt();
        int num = 2; 
        System.out.println("First " + evennumber + " even numbers are mentioned below :");
        
        for (int i = 0; i < evennumber; i++) {
            System.out.println(num);
            num += 2;
        }

        sc.close();
    }
}

