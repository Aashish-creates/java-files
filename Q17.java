 import java.util.*;
 class Q17 {
    public static void main(String args[])
    {
int c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st element");
int a=sc.nextInt();

System.out.println("enter the 2nd element");
int b=sc.nextInt();

try{
    c=a/b;
    System.out.println("the answer is: " +c);
}
catch(ArithmeticException e)
{
    System.out.println("cannot divide by zero");
}
sc.close();
}   
}
