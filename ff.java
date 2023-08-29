import java.io.IOException;
import java.io.File;
public class ff {
    public static void main(String a[])
    {
        try{
        File obj=new File("q.txt");
        if(obj.createNewFile())
        {
            System.out.println("file created"+obj.getName());
        }
    }
        catch(Exception e)
        {
            System.out.println("error");
        }
        


    }
}
