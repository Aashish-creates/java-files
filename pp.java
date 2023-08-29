import java.io.IOException;
import java.io.FileWriter;

public class pp {
    public static void main(String a[])
    {
        try{
            FileWriter Writer=new FileWriter("q.txt");
            Writer.write("hello abc");
            Writer.close();
            System.out.println("okayy");
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
    }
    
}
