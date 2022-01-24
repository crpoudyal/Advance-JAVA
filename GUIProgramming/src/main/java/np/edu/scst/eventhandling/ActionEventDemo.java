package np.edu.scst.eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventDemo extends JFrame
        implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }

    ActionEventDemo() {
        JButton jbtn = new JButton("Click me");

        jbtn.addActionListener(this);

        add(jbtn);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setTitle("Event Handling");
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new ActionEventDemo();

    }

}
