public class Q9 {
    public static void main(String args[])
    {
        String s="java";
        String s1="welcome";

        String s2=s.concat(s1);
        System.out.println(s2);

        char c=s2.charAt(1);
        System.out.println(c);

        int a=s.indexOf('a');
        System.out.println(a);

        int x=s.indexOf('a', a+1);
        System.out.println(x);

        String ST="JAVA";
        int comp=s.compareTo(ST);
        System.out.println(comp);

        int cc=s.compareToIgnoreCase(ST);
        System.out.println(cc);

    int v=s.indexOf('a',-1);
    System.out.println(v);
    }
}
