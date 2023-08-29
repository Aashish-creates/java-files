public class Q23 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread thread1 = new Thread(new NumberRunnable(printer, 1));
        Thread thread2 = new Thread(new NumberRunnable(printer, 2));
        Thread thread3 = new Thread(new NumberRunnable(printer, 3));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class NumberPrinter {
    private int nextNumber = 1;

    public synchronized void printNumber(int threadId) {
        while (nextNumber <= 10) {
            if (threadId == (nextNumber % 3) + 1) {
                System.out.println("Thread " + threadId + ": " + nextNumber);
                nextNumber++;
                notifyAll(); 
            } else {
                try {
                    wait(); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class NumberRunnable implements Runnable {
    private NumberPrinter printer;
    private int threadId;

    public NumberRunnable(NumberPrinter printer, int threadId) {
        this.printer = printer;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        printer.printNumber(threadId);
    }
}
