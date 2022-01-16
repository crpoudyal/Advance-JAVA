package np.edu.scst.first;

import java.awt.*;
import javax.swing.*;

public class SwingComp extends JFrame {

    SwingComp() {

        JLabel lbl = new JLabel("Hello");
        JLabel lbl1 = new JLabel("Hello world");

        add(lbl);
        add(lbl1);

        setLayout(new FlowLayout());

        setVisible(true);

        setSize(500, 500);

        setTitle("Swing Component");

        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        SwingComp sc = new SwingComp();
    }
}
