package np.edu.scst.lab1;

import javax.swing.*;

public class DisplayImg extends JFrame {

    DisplayImg() {

        JPanel jpanel = new JPanel();

        ImageIcon img = new ImageIcon("scst.jpeg");
        JLabel lbl = new JLabel(img);
        jpanel.add(lbl);

        add(jpanel);

        setVisible(true);
        setTitle("Displaying Image");
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new DisplayImg();
    }

}
