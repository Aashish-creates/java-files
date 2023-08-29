public class Q24 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();

        String thread1Name = thread1.getName();
        String thread2Name = thread2.getName();
        int thread1Priority = thread1.getPriority();
        int thread2Priority = thread2.getPriority();

        System.out.println("Thread 1 name: " + thread1Name);
        System.out.println("Thread 2 name: " + thread2Name);
        System.out.println("Thread 1 priority: " + thread1Priority);
        System.out.println("Thread 2 priority: " + thread2Priority);
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running thread: " + getName());
    }
}

