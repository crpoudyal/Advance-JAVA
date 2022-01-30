package np.edu.scst.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EligibleToVote extends JFrame {

    EligibleToVote() {
        JLabel lbl = new JLabel("Enter Your Age : ");
        JTextField txt = new JTextField(3);
        JLabel res = new JLabel();
        JButton btn = new JButton("Check");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tx = txt.getText().toString();
                int age = Integer.parseInt(tx);
                if (age >= 18) {
                    res.setText("Your age is " + age + " You can vote in comming elections.");
                } else {
                    res.setText("Your age is " + age + " You can't vote in comming elections.Your age must be greater and equals to 18");
                }

            }
        });

        add(lbl);
        add(txt);
        add(res);
        add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(3);
        setTitle("Eligible to Vote");
        setSize(300, 300);

    }

    public static void main(String[] args) {
        new EligibleToVote();
    }

}
