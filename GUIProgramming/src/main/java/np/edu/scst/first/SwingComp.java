package np.edu.scst.first;

import java.awt.*;
import javax.swing.*;

public class SwingComp extends JFrame {

    SwingComp() {

        JLabel lbl = new JLabel("Enter");

        add(lbl);

        JTextField txt = new JTextField("Enter Username", 20);

        add(txt);
        JLabel lbl2 = new JLabel("Password");
        add(lbl2);

        JPasswordField jpass = new JPasswordField(20);
        add(jpass);

        JLabel lbl1 = new JLabel("TextArea");
        add(lbl1);

        JTextArea txtarea = new JTextArea(5, 20);
        add(txtarea);

        JLabel lbl3 = new JLabel("Gender");
        add(lbl3);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup btngrp = new ButtonGroup();
        add(male);
        add(female);

        btngrp.add(male);
        btngrp.add(female);

        JLabel lbl4 = new JLabel("Countries");
        add(lbl4);

        setLayout(new FlowLayout());

        setVisible(true);

        setSize(300, 500);

        setTitle("Swing Component");

        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        SwingComp sc = new SwingComp();
    }
}
