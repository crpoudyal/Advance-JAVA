package np.edu.scst.first;

import javax.swing.*;

public class DisplayImage extends JFrame {

    DisplayImage() {

        ImageIcon img = new ImageIcon("html5.png");
        JLabel lbl = new JLabel(img);
        lbl.setSize(50, 50);
        add(lbl);

        setVisible(true);
        setTitle("Displaying Image");
        setSize(500, 500);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new DisplayImage();

    }
}
