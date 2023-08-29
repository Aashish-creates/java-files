   class details {
    String name;
    String account_no;
    double amount;

    void insert_det(String a,String b,double c)
    {
        name=a;
        account_no=b;
        amount=c;
    }
    void deposit(int deposit)
    {
        amount=amount+deposit;
    }
    void withdraw(int with)
    {
        if(amount>=with)
        {
            amount=amount-with;
        }
        else
        {
        System.out.println("no sufficient balance");
        }
    }
    void checkbalance()
    {
        System.out.println("the available balance is: "+amount);
    }
    void display()
    {
        System.out.println("the name of the customer is: "+name);
        System.out.println("the account number of the customer is: "+account_no);
        System.out.println("the total amount present in bank is: "+amount);
    }
}
class bank
{
public static void main(String args[])
{
    details d=new details();
    d.insert_det("aashish","2011503",4000.00);
    d.deposit(200);
    d.withdraw(500);
    d.checkbalance();
    d.deposit(700);
    d.display();
}
}
