import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q25 {
    public static void main(String[] args) {
        Display display = new Display();

        Thread thread1 = new Thread(new WishRunnable(display, "aashish"));
        Thread thread2 = new Thread(new WishRunnable(display, "Batman"));
        Thread thread3 = new Thread(new WishRunnable(display, "james bond"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Display {
    private Lock lock = new ReentrantLock();

    public void wish(String name) {
        lock.lock();
        try {
            System.out.print("Hello ");
            Thread.sleep(500);
            System.out.println(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class WishRunnable implements Runnable {
    private Display display;
    private String name;

    public WishRunnable(Display display, String name) {
        this.display = display;
        this.name = name;
    }
    public void run() {
        display.wish(name);
    }
}
