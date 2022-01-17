package np.edu.scst.first;

import java.awt.*;
import javax.swing.*;

public class DrawingShapes extends JFrame {

    DrawingShapes() {
        JPanel jpanel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.drawLine(10, 50, 50, 50);
            }

        };

        add(jpanel);

        setVisible(true);

        setSize(500, 500);

        setTitle("Drawing Shapes");

        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        DrawingShapes ds = new DrawingShapes();
    }

}
