class Customer {
    private int balance;

    public Customer(int balance) {
        this.balance = balance;
    }

    public synchronized void withdrawal(int amount) {
        if (amount > balance) {
            try {
                System.out.println("Insufficient balance. Waiting for deposit...");
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance: " + balance);

        notify(); 
    }
}

 class Q27 {
    public static void main(String[] args) {
        Customer customer = new Customer(1000);

        Thread withdrawalThread = new Thread(() -> customer.withdrawal(800));
        Thread depositThread = new Thread(() -> customer.deposit(500));

        withdrawalThread.start();
        depositThread.start();
    }
}

