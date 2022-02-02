package np.edu.scst.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Division extends JFrame {

    Division() {
        JLabel jlbl = new JLabel("Enter a number");

        JTextField jtext = new JTextField(5);

        JLabel jlbl1 = new JLabel("Enter a number");

        JTextField jtext1 = new JTextField(5);

        JButton btn = new JButton("Division");

        JLabel res = new JLabel();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = jtext.getText().toString();
                String txt1 = jtext1.getText().toString();
                int a = Integer.parseInt(txt);
                int b = Integer.parseInt(txt1);
                try {
                    int div = a / b;
                    res.setText(div + "");
                } catch (Exception ex) {
                    res.setText("Exception :  " + ex);
                }
            }
        });

        add(jlbl);
        add(jtext);
        add(jlbl1);
        add(jtext1);
        add(btn);
        add(res);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(3);
        setTitle("Division");
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new Division();

    }

}
