class bill{
    String name;
    int unit;
    Double amount;
     void set_details(String a,int b)
     {
        name=a;
        unit=b;
        calc();
     }
     void display()
     {
        System.out.println("the name of the user is:"+name);
        System.out.println("the amount to be paid is:"+amount);
     }
     void calc()
     {
        if(unit<=100)
        {
        amount=0.6*unit;
        }
        else if(unit<=300&&unit>100)
        {
            amount=((unit-100)*0.8)+60;
        }
        else if(unit>=300)
        {
            amount=60+80+(0.9*(unit-300));
        }
        amount=amount+50;
        if(amount>300)
        {
            amount=amount*0.15;
        }


     }
}
class q1
{
public static void main(String args[])
{
    bill b=new bill();
    b.set_details("aashish",400);
    b.display();
}
}
