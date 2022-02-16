// 1.Write a Program (WAP) to display a star shape inside of a swing application.
package np.edu.scst.lab1;

import javax.swing.*;
import java.awt.*;

public class StarShape extends JFrame {

    StarShape() {
        JPanel jpanel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                int xPnts[] = {42, 52, 72, 52, 60, 40, 15, 28, 9, 32, 42};
                int yPnts[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};
                g2d.drawPolygon(xPnts, yPnts, xPnts.length);
            }

        };
        add(jpanel);
        setVisible(true);
        setTitle("STAR Shape in Swing");
        setSize(250, 250);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new StarShape();

    }

}
