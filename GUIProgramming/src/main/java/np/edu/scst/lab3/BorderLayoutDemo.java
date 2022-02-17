package np.edu.scst.lab3;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {

    BorderLayoutDemo() {

        JButton jbtn = new JButton("North");
        JButton jbtn1 = new JButton("South");
        JButton jbtn2 = new JButton("West");
        JButton jbtn3 = new JButton("East");
        JButton jbtn4 = new JButton("Center");
        JPanel jpanel = new JPanel();

        jpanel.setLayout(new BorderLayout(5, 5));
        jpanel.add(jbtn, BorderLayout.NORTH);
        jpanel.add(jbtn1, BorderLayout.SOUTH);
        jpanel.add(jbtn2, BorderLayout.WEST);
        jpanel.add(jbtn3, BorderLayout.EAST);
        jpanel.add(jbtn4, BorderLayout.CENTER);

        add(jpanel);

        setVisible(true);
        setDefaultCloseOperation(3);
        setTitle("Border Layout Example");
        setSize(300, 300);

    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
