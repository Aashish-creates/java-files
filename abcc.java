class A{
    void show()
    {
        System.out.println("A ka show");
    }
}
class B extends A{
    void show()
    {
        System.out.println("this is B ka show");
    }
  
}
class abcc {
    public static void main(String args[])
    {
        A obj=new B();
        obj.show();
    }
    
}
