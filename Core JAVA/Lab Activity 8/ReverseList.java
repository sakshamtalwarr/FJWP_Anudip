import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Date");

        Collections.reverse(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
