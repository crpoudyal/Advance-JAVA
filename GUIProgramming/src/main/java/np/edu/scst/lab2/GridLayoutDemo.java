package np.edu.scst.lab2;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {

        JButton pro1 = new JButton("Product 1");
        add(pro1);

        JButton pro2 = new JButton("Product 2");
        add(pro2);

        JButton pro3 = new JButton("Product 3");
        add(pro3);

        JButton pro4 = new JButton("Product 4");
        add(pro4);

        JButton pro5 = new JButton("Product 5");
        add(pro5);

        setVisible(true);
        setLayout(new GridLayout(2, 3, 12, 12));
        setTitle("GridLayout Demo");
        setSize(500, 500);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {

        new GridLayoutDemo();
    }

}
