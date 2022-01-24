package np.edu.scst.first;

import javax.swing.*;
import java.awt.*;

public class DisplayImage extends JFrame {

    DisplayImage() {
        JPanel jpanel = new JPanel();

        ImageIcon img = new ImageIcon("html5.png");
        JLabel lbl = new JLabel(img);
        jpanel.add(lbl);

        lbl.setSize(400, 400);

        add(jpanel);

        setVisible(true);
        setTitle("Displaying Image");
        setSize(500, 500);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new DisplayImage();

    }
}
