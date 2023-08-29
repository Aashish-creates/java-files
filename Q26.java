public class Q26{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new WishRunnable("Aashish"));
        Thread thread2 = new Thread(new WishRunnable("Subedi"));
        Thread thread3 = new Thread(new WishRunnable("Batman"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Display {
    private static final Object lock = new Object();

    public static synchronized void wish(String name) {
        System.out.print("Hello ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
}

class WishRunnable implements Runnable {
    private String name;

    public WishRunnable(String name) {
        this.name = name;
    }
    public void run() {
        Display.wish(name);
    }
}

