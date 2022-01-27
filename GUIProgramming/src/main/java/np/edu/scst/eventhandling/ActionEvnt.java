package np.edu.scst.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEvnt extends JFrame {

    ActionEvnt() {

        JButton jbtn = new JButton("Click me");
        JButton jbtn1 = new JButton("Click me again");
        JButton jbtn2 = new JButton("Click me again & again");

        // Anonymous inner class / object
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked");
            }
        });
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked");
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 clicked");
            }
        });
        add(jbtn);
        add(jbtn1);
        add(jbtn2);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setTitle("Button Event Handling");
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new ActionEvnt();

    }

}
