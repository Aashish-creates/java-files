import java.util.Scanner;

class Q2 {
    String name;
    int income;
    float tax_value;

    Q2(String name, int income) {
        this.name = name;
        this.income = income;
    }

    void calc() {
        if (income <= 250000) {
            tax_value = 0;
        } else if (income <= 300000) {
            tax_value = (income - 250000) * 0.10f;
        } else if (income <= 400000) {
            tax_value = (income - 300000) * 0.20f + 5000;
        } else if (income > 400000) {

            tax_value = (income - 400000) * 0.30f + 25000;
        }

    }

    void display() {
        System.out.println("----------------------------------");
        System.out.println("NAME OF USER ->" + name);
        System.out.println("INCOME OF USER ->" + income);
        System.out.println("TAX PAID BY USER->" + tax_value);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        String name;
        int income;
        Scanner sc = new Scanner(System.in);
        System.out.println("NAME OF USER ->");
        name = sc.nextLine();
        System.out.println("INCOME OF USER ->");
        income = sc.nextInt();
        Q2 a = new Q2(name, income);
        a.calc();
        a.display();
        sc.close();
    }
}
