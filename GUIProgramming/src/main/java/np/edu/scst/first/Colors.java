package np.edu.scst.first;

import javax.swing.*;
import java.awt.*;

public class Colors extends JFrame {

    Colors() {

        JPanel jpanel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;

                Color cyan = new Color(0, 255, 255);
                g2.setColor(cyan);

                g2.drawLine(50, 50, 500, 400);

                Color red = new Color(255, 0, 0);
                g2.setColor(red);

                g2.fillOval(20, 90, 50, 50);
            }

        };

        add(jpanel);

        setVisible(true);

        setSize(500, 500);

        setTitle("Drawing Shapes");

        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new Colors();

    }

}
