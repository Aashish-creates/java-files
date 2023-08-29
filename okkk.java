import java.io.*;
class okkk {
    void m1()
    {
        System.out.println(1/0);

    }
    void m2()
    {
        m1();
    }
    void m3()
    {
        m2();
    }
    public static void main(String args[])
    {
        okkk a=new okkk();
        try{
            a.m3();
        }
        catch(ArithmeticException e)
        {
            System.out.println("okayy");
        }
        System.out.println("normal flow");
    }
    

    
}
