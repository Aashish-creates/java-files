class Bill {
    private String name;
    private int unit;
    private double amount;

    public void setDetails(String a, int b) {
        name = a;
        unit = b;
        calculateAmount();
    }

    public void display() {
        System.out.println("Name of the user: " + name);
        System.out.println("Amount to be paid: " + amount);
    }

    private void calculateAmount() {
        double calculatedAmount;

        if (unit <= 100) {
            calculatedAmount = 0.6 * unit;
        } else if (unit <= 300) {
            calculatedAmount = ((unit - 100) * 0.8) + 60;
        } else {
            calculatedAmount = 60 + 80 + (0.9 * (unit - 300));
        }

        calculatedAmount += 50;

        if (calculatedAmount > 300) {
            calculatedAmount *= 1.15;
        }

        amount = calculatedAmount;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.setDetails("aashish", 400);
        bill.display();
    }
}
