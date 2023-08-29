import java.io.*;
class abc {
    public static void main(String args[]) throws IOException
    {
FileInputStream r=new FileInputStream("output.txt");
FileOutputStream w=new FileOutputStream("hello.txt");
int i;
while((i=r.read())!=-1)
{
    w.write((char)i);
}
    }
    
}
