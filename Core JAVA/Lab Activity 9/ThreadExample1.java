

class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = sum / 10.0;
        System.out.println("Average of first 10 numbers: " + average);
    }
}

class SquareThread extends Thread {
    public void run() {
        int[] arr = {1, 20, 50, 15, 30};
        System.out.println("Squares of array elements:");
        for (int num : arr) {
            System.out.println(num + "^2 = " + (num * num));
        }
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        // start the threads
      
        t1.start();
        try {
            t1.join(); // wait for the completion of t1
            t1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // start the second thread after the first thread has completed
      
        t2.start();
    }
}

<<<<<<<  431cfaeb-805a-4515-84d4-fdaf7953e0e7  >>>>>>>>