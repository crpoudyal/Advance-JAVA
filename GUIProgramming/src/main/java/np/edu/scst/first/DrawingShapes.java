package np.edu.scst.first;

import java.awt.*;
import javax.swing.*;

public class DrawingShapes extends JFrame {

    DrawingShapes() {
        JPanel jpanel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                //  line
                g2.drawLine(10, 10, 40, 40);
                //  rectangle
                g2.drawRect(50, 10, 50, 30);
                //  square
                g2.drawRect(130, 80, 40, 40);
                //  oval
                g2.drawOval(10, 70, 50, 30);
                //  circle
                g2.drawOval(70, 90, 50, 50);
                //  Arc
                g2.drawArc(150, 150, 200, 200, 10, 80);
                // Polygon
                int[] x = {200, 500, 800, 700};
                int[] y = {200, 500, 300, 600};
                g2.drawPolygon(x, y, 4);

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
