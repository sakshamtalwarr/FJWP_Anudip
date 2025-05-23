class RaceThread extends Thread {
    RaceThread(String name) {
        super(name); // Set the name of the thread
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Step " + i);
            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " finished the race!");
    }
}

public class ThreadRace {
    public static void main(String[] args) {
        RaceThread t1 = new RaceThread("Turtle");
        RaceThread t2 = new RaceThread("Rabbit");
        RaceThread t3 = new RaceThread("Horse");

        // Set different priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
