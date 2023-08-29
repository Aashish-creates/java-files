import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.*;
class testw {

    Frame f1;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b1,b2;
    testw()
    {
        f1=new Frame("addition");
        f1.setLayout(null);
        f1.setVisible(true);
       
        f1.setSize(400, 400);
        t1=new TextField();
        t1.setBounds(100, 40, 150, 30);
        t2=new TextField();
        t2.setBounds(120,    80  ,150,30 );
        l1=new Label("First number");
        l1.setBounds(20, 40, 150, 30);
        l2=new Label("second number");
        l2.setBounds(20,80,150,30);
        b1=new Button ("sum");
        b1.setBounds(120, 120, 60, 20);
        b2=new Button ("sub");
        b2.setBounds(200, 120, 60, 20);
        l3=new Label("answer");
        l3.setBounds(150,150,40,40);
        t3=new TextField();
        t3.setBounds(150, 200, 60, 20);


        f1.add(t1);
        f1.add(t2);
        f1.add(l1);
        f1.add(l2);
        f1.add(b1);
        f1.add(l3);
        f1.add(t3);
        f1.add(b2);


         f1.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e)
          {
             f1.dispose();
       }
            
        });


         b1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
                int x=Integer.parseInt(t1.getText());
                int y=Integer.parseInt(t2.getText());
                int result=x+y;
                t3.setText(Integer.toString(result));

            }
         });



           b2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
                int x=Integer.parseInt(t1.getText());
                int y=Integer.parseInt(t2.getText());
                int result=x-y;
                t3.setText(Integer.toString(result));

            }
         });


    }

}





public class test{

    public static void main(String[] args)
{
    testw t =new testw();
}

}
