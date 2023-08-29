import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q30 extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;

    public Q30() {
        setTitle("Number Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Create text fields
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field read-only

        // Create buttons
        JButton sumButton = new JButton("SUM");
        JButton subtractionButton = new JButton("SUBTRACTION");

        // Add action listeners to buttons
        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performSum();
            }
        });

        subtractionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performSubtraction();
            }
        });

        // Add components to the frame
        add(new JLabel("Number 1:"));
        add(num1Field);
        add(new JLabel("Number 2:"));
        add(num2Field);
        add(sumButton);
        add(subtractionButton);
        add(new JLabel("Result:"));
        add(resultField);

        setVisible(true);
    }

    private void performSum() {
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int result = num1 + num2;
        resultField.setText(String.valueOf(result));
    }

    private void performSubtraction() {
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int result = num1 - num2;
        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Q30();
            }
        });
    }
}

