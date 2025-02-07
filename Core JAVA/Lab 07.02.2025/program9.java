// Q9. Wap to calculate the sum of first 10 natural numbers
     
public class program9 { 
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of first 10 natural numbers is: " + sum);
    }
}