package pack 1
import java.util.Scanner
class ArrayDemo {
      

    public static void main(String[] args) {
    // define array with size 5
    int id[] = new int [5];
 
    // input array value from the user
    Scanner sc=new Scanner (System.in);
    id[0] = sc.nextInt();
    for (int i=0;i<id.length;i++) {
    System.out.println(id[i]);
    }
    // display values of array/ traverse array one by one
    }
}
