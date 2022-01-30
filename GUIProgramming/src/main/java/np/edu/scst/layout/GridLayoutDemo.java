package np.edu.scst.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {
        JLabel jlbl = new JLabel("Hello");
        JLabel jlbl1 = new JLabel("Hello");
        JLabel jlbl2 = new JLabel("Hello");
        JLabel jlbl3 = new JLabel("Hello");
        JLabel jlbl4 = new JLabel("Hello");

        add(jlbl);
        add(jlbl1);
        add(jlbl2);
        add(jlbl3);
        add(jlbl4);

        setLayout(new GridLayout(3, 2, 20, 20));
        setVisible(true);
        setDefaultCloseOperation(3);
        setTitle("Grid Layout Example");
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();

    }

}
