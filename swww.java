import javax.swing.*;
class swww extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    
    
    swww(){}
     swww(String s)
    {
        super(s); 
    }
    void setcomponents()
    {
       l1=new JLabel("addition of two numbers") ;
       l2=new JLabel("first number");
       l3=new JLabel("second number");
       t1=new JTextField();
       t2=new JTextField();
       b1=new JButton("ADD");
setLayout(null);
l1.setBounds(50,50,200,50);
l2.setBounds(50, 80, 50, 20);
t1.setBounds(200,100,50,20);
t2.setBounds(80,180,100,20);
b1.setBounds(50,240,200,20);

       add(l1);
       add(l2);
       add(t1);
       add(l3);
       add(t2);
       add(b1);
       add(l4);
    }
    public static void main(String args[])
    {
        swww j1=new swww("addition of two number");
        j1.setSize(300, 300);
        j1.setVisible(true);
        j1.setcomponents();
        

    }
}
