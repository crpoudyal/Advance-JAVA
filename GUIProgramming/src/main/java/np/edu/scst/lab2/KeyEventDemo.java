package np.edu.scst.lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventDemo extends JFrame {

    KeyEventDemo() {
        JLabel lb = new JLabel("Enter something");
        JTextField txt = new JTextField(20);
        JLabel lbl = new JLabel("***");
        txt.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                lbl.setText("Key Pressed");
            }
        });
        add(lb);
        add(txt);
        add(lbl);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Keyboard Event Handling");
        setSize(500, 500);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }

}
