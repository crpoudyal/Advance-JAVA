// 2.WAP to display ‘Hello world’ in a JLabel, contained inside of a cyan-backgrounded JPanel, inside of a JFrame.
package np.edu.scst.lab1;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {

    HelloWorld() {
        JPanel jpanel = new JPanel();

        JLabel lbl = new JLabel("Hello World");

        jpanel.add(lbl);
        add(jpanel);

        setVisible(true);
        jpanel.setBackground(Color.CYAN);
        setLayout(new FlowLayout());
        setTitle("Hello world");
        setSize(300, 300);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new HelloWorld();

    }

}
