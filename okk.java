class A{
    void abc()
    {
        System.out.println("hello...");
    }
}
class B extends A{
    void abc()
    {
        super.abc();
        System.out.println("hi..");
    }
}


class okk {
    public static void main(String a[])
    {
B obj=new B();
obj.abc();
    }
    
}
