package np.edu.scst.application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class PalindromeApp extends JFrame {

    PalindromeApp() {
        JLabel txt = new JLabel("Enter any Text");
        add(txt);
        JTextField jtext = new JTextField(10);
        add(jtext);

        JButton jbtn = new JButton("Check");
        add(jbtn);
        JLabel res = new JLabel();
        add(res);

        jbtn.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                String input = jtext.getText();
                if (isPalindrome(input)) {
                    res.setText(input
                            + " It is Palindrome");

                } else {
                    res.setText(input + " It is not Palindrome");
                }
            }
        });

        setVisible(
                true);
        setLayout(
                new FlowLayout());
        setDefaultCloseOperation(
                3);
        setSize(
                500, 500);
        setTitle(
                "Palindrome or NOT");

    }

    public boolean isPalindrome(String str) {
        char[] c = str.toCharArray();
        StringBuilder temp = new StringBuilder(str);
        temp.reverse();
        return str.equals(temp.toString());

    }

    public static void main(String[] args) {
        new PalindromeApp();
    }
}
