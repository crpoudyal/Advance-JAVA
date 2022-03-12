package np.edu.scst.lab2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PrimeOrNot extends JFrame {

    PrimeOrNot() {

        JLabel lbl = new JLabel("Enter any number");
        JTextField txt = new JTextField(10);
        JButton btn = new JButton("Check");
        JLabel res = new JLabel("***");

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int input = Integer.parseInt(txt.getText());

                if (isPrime(input)) {
                    res.setText("It is prime Number");
                } else {
                    res.setText("It is not prime Number");
                }
            }

        });

        add(lbl);
        add(txt);
        add(btn);
        add(res);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Prime or not");
        setSize(200, 200);
        setDefaultCloseOperation(3);

    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        new PrimeOrNot();
    }

}
