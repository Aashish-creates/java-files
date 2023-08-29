import javax.swing.*;
import java.awt.*;

public class Q29 extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 40, 40);
        g.fillOval(180, 100, 40, 40);

        g.setColor(Color.BLACK);
        g.drawArc(100, 160, 120, 60, 200, 140);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        Q29 canvas = new Q29();
        frame.add(canvas);
        frame.setVisible(true);
    }
}
