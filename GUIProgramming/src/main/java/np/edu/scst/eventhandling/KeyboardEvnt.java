package np.edu.scst.eventhandling;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class KeyboardEvnt extends JFrame {

    KeyboardEvnt() {
        JTextField jtxt = new JTextField(20);
        JTextField jtxt1 = new JTextField(20);

        jtxt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released");
            }

        });

        add(jtxt);

        add(jtxt1);

        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400, 400);
        setTitle("Keyboard Event Handling");

    }

    public static void main(String[] args) {
        new KeyboardEvnt();

    }

}
