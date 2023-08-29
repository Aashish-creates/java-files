import javax.swing.*;

public class Q28 {
    public static void main(String[] args) {
  
        JFrame frame = new JFrame("Student Information System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 20);
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 60, 100, 20);
        JLabel branchLabel = new JLabel("Branch:");
        branchLabel.setBounds(20, 100, 100, 20);
        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(20, 140, 100, 20);
        JLabel universityLabel = new JLabel("University:");
        universityLabel.setBounds(20, 180, 100, 20);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(120, 20, 200, 20);
        JTextField idTextField = new JTextField();
        idTextField.setBounds(120, 60, 200, 20);
        JTextField branchTextField = new JTextField();
        branchTextField.setBounds(120, 100, 200, 20);
        JTextField cityTextField = new JTextField();
        cityTextField.setBounds(120, 140, 200, 20);
        JTextField universityTextField = new JTextField();
        universityTextField.setBounds(120, 180, 200, 20);

        
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(160, 220, 80, 30);
        saveButton.addActionListener(e -> {
            String name = nameTextField.getText();
            String id = idTextField.getText();
            String branch = branchTextField.getText();
            String city = cityTextField.getText();
            String university = universityTextField.getText();

        
            nameTextField.setText("");
            idTextField.setText("");
            branchTextField.setText("");
            cityTextField.setText("");
            universityTextField.setText("");

            JOptionPane.showMessageDialog(null, "Student information saved successfully!");
        });

        frame.add(nameLabel);
        frame.add(idLabel);
        frame.add(branchLabel);
        frame.add(cityLabel);
        frame.add(universityLabel);
        frame.add(nameTextField);
        frame.add(idTextField);
        frame.add(branchTextField);
        frame.add(cityTextField);
        frame.add(universityTextField);
        frame.add(saveButton);

        frame.setVisible(true);
    }
}

