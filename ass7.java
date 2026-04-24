
// Thread to print even numbers
class EvenThread extends Thread {
    private int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500); // pause for readability
            } catch (InterruptedException e) {
                System.out.println("EvenThread interrupted.");
            }
        }
    }
}

// Thread to print odd numbers
class OddThread extends Thread {
    private int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= limit; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500); // pause for readability
            } catch (InterruptedException e) {
                System.out.println("OddThread interrupted.");
            }
        }
    }
}

// Demo class
public class EvenOddThreadsDemo {
    public static void main(String[] args) {
        int limit = 20; // print numbers up to 20

        EvenThread evenThread = new EvenThread(limit);
        OddThread oddThread = new OddThread(limit);

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}

