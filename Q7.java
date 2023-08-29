import java.util.Scanner;
 class employee{
int ID;
String name;
String department;
Double salary;
employee(){}
void set_details()
{
    Scanner sc =new Scanner(System.in);
    System.out.println("enter ID: ");
     this.ID=sc.nextInt();
    System.out.println("enter name: ");
    sc.nextLine();
    this.name=sc.nextLine();

    System.out.println("enter department: ");
    this.department=sc.nextLine();

    System.out.println("enter salary: ");
    this.salary=sc.nextDouble();
    sc.close();

}
void show_details()
{
    System.out.println("ID: " +this.ID);
    System.out.println("name: "+this.name);
    System.out.println("department: "+this.department);
    System.out.println("salary: "+this.salary);
}

 }



class Q7 {
    public static void main(String args[])
    {
        employee aa=new employee();
        aa.set_details();
        aa.show_details();
    }
    
    
}
