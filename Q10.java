
public class Q10 {
    public static void main(String args[])
    {
        StringBuffer str=new StringBuffer("HELLO");
        str.append("java");
        System.out.println(str);

        str.insert(1,"java");
        System.out.println(str);

        str.replace(1,2,"java");
        System.out.println(str);

        str.delete(1,2 );
        System.out.println(str);

        String st = "HELLO";
        String reversed = new StringBuilder(st).reverse().toString();
        System.out.println(reversed);
    }
}
