class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdrawal(int amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance to make the withdrawal");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdrawal(500);
            account.withdrawal(800);
        } catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

