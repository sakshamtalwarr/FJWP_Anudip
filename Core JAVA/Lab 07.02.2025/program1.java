
// q.1 Wap to print all even numbers from the given range

public class program1 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("even numbers: "+i);
            }
        }
    }
}
