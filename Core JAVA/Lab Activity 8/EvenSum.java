import java.util.ArrayList;

public class EvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(10);

        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
