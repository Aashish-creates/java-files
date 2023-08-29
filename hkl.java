import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class test1 extends JFrame implements ActionListener{

    JFrame Frame;
    JLabel Label1,Label2,Label3;
    JButton Button1,Button2;
    JTextField T1,T2,T3;


    test1()
    {
        Frame= new JFrame("testing");
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.setSize(500,500);

        Label1=new JLabel("first number");
        Label1.setBounds(20,20,70,30);

        T1=new JTextField();
        T1.setBounds(100,20,50,30);

        Label2=new JLabel("second number");
        Label2.setBounds(20,50,70,30);

        T2=new JTextField();
        T2.setBounds(150,50,50,30);

        Button1=new JButton("sum");
        Button1.setBounds(20,70,100,30);

        Button2=new JButton("sub");
        Button2.setBounds(130,70,100,30);

        Label3=new JLabel("answer");
        Label3.setBounds(100,100,70,30);

        T3=new JTextField();
        T3.setBounds(150,100,50,30);



        Button1.addActionListener(this);
        Button2.addActionListener(this);


         
Frame.add(Label1);
Frame.add(T1);
Frame.add(T2);
Frame.add(Label2);
Frame.add(Button1);
Frame.add(Button2);
Frame.add(T3);
Frame.add(Label3);

    }

      public  void actionPerformed(ActionEvent e)
        {
            int x=Integer.parseInt(T1.getText());
            int y=Integer.parseInt(T2.getText());

            if(e.getSource()==Button1)
            {
                int z=x+y;
                T3.setText(Integer.toString(z));
                

            }
            if(e.getSource()==Button2)
            {
                int z=x-y;
                T3.setText(Integer.toString(z));
                

        }

    }



   
}


public class hkl{

    public static void main(String [] args)
    {
        test1 t= new test1();

    }
}