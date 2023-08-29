import java.util.Scanner;

public class Q12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int rows=sc.nextInt();

        System.out.println("enter the no. of columns");
        int columns=sc.nextInt();
        
        int[][] array=new int [rows][columns];

         System.out.println("enter the elements");
         for(int i=0;i<rows;i++)
         {
            for(int j=0;j<columns;j++)
            {
                array[i][j] = sc.nextInt();
            }
         }
         System.out.println("the elements are");
         for(int i=0;i<rows;i++)
         {
            for(int j=0;j<columns;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
         }
         System.out.println("enter the element to search");
         int search=sc.nextInt();
         boolean found =false;
         for(int i=0;i<rows;i++)
         {
            for(int j=0;j<columns;j++)
            {
                if(array[i][j]==search)
                {
                    System.out.println("elemnt found at location "+i+" "+j);
                 found=true;
                }

            }
         }
         if(!found)
            System.out.println("element bot found");
        sc.close();
        }
}
