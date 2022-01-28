package np.edu.scst.eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdapterDemo extends JFrame {

    AdapterDemo() {
        JButton jbutton = new JButton("Click");
        jbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");

            }
        });
        add(jbutton);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400, 400);
        setTitle("Adapter Class Example");

    }

    public static void main(String[] args) {
        new AdapterDemo();
    }

}
